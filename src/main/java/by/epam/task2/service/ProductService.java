package by.epam.task2.service;

import by.epam.task2.bean.Product;

import java.util.ArrayList;

public interface ProductService {
    ArrayList<Product> getProductList();
    void addNewProduct(Product product);

}
