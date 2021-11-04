package by.epam.task2.dao;

import by.epam.task2.bean.Product;

import java.util.ArrayList;

public interface ProductDao {

    ArrayList <Product> getProductList();
    void addProduct (Product product);
    void deleteProduct (Product product);
}
