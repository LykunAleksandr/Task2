package by.epam.task2.dao;

import by.epam.task2.bean.Product;

import java.util.ArrayList;

public class ImplProductDao implements ProductDao {


    public ImplProductDao() {

    }
    @Override
    public ArrayList <Product> getProductList (){
        Storage storage = Storage.getInstanse();
        ArrayList <Product> list = storage.getProductList();
        return list;
    }

    @Override
    public void addProduct(Product product) {
        Storage storage = Storage.getInstanse();
        ArrayList <Product> list = storage.getProductList();
        list.add(product);
        storage.save(list);
    }
    @Override
    public void deleteProduct(Product product) {
         // delete Product from List
    }
}
