package by.epam.task2.dao;

import by.epam.task2.bean.Product;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class DataWriter {

    private static final String path = "by.epam.task2.files/DataBase.txt";

    public void writeProductInFile (ArrayList<Product> list) throws IOException {

        FileWriter writer = new FileWriter(path);
        for (int i = 0; i < list.size(); i++) {
            writer.write(list.get(i).getClass() + " ");
        }
    }

}
