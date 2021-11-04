package by.epam.task2.dao;

import by.epam.task2.bean.Product;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Storage {

    private static final Storage instanse = new Storage();
    private ArrayList<Product> productList;

    public Storage() {
        DataReader reader = new DataReader();
        try {
            productList = reader.readProductsFromFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public static Storage getInstanse() {
        return instanse;
    }

    public void save (ArrayList <Product> list){
        // Write list in file
    };


}

