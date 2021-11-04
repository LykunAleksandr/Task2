package by.epam.task2.service;

import by.epam.task2.bean.Product;
import by.epam.task2.dao.DaoFactory;
import by.epam.task2.dao.ProductDao;

import java.util.ArrayList;

public class ImplProductService implements ProductService {
    @Override
    public ArrayList<Product> getProductList() {
        // Проверить параметры
        DaoFactory daoFactory = DaoFactory.getInstance();
        ProductDao productDao = daoFactory.getProductDao();
        ArrayList<Product> list = productDao.getProductList();
        return list;
        //
    }

    @Override
    public void addNewProduct(Product product) {
        // Проверить параметры
        DaoFactory daoFactory = DaoFactory.getInstance();
        ProductDao productDao = daoFactory.getProductDao();
        productDao.addProduct(product);
    }
}
