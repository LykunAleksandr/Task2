package by.epam.task2.dao;

public class DaoFactory {

    private static final DaoFactory instance = new DaoFactory();
    private final ProductDao implProductDao = new ImplProductDao();

    private DaoFactory (){ };

    public static DaoFactory getInstance() {
        return instance;
    }

    public ProductDao getProductDao() {
        return implProductDao;
    }
}
