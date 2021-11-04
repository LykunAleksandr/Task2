package by.epam.task2.dao;

import by.epam.task2.bean.Fridge;
import by.epam.task2.bean.Iron;
import by.epam.task2.bean.MicroWave;
import by.epam.task2.bean.Product;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataReader {
    private static final String path = "by.epam.task2.files/DataBase.txt";

    public ArrayList<Product> readProductsFromFile() throws FileNotFoundException {
        FileInputStream stream = new FileInputStream(path);
        Scanner scanner = new Scanner(stream);

        ArrayList<Product> productsArray = new ArrayList<Product>();
        do {
            String productType = scanner.next();
            productType = productType.toUpperCase();
            double price = scanner.nextDouble();
            double weight = scanner.nextDouble();
            switch (productType){
                case ("FRIDGE"):
                {
                    double coldCameraCapacity = scanner.nextDouble();
                    double freezerCapacity = scanner.nextDouble();
                    Fridge fridge = new Fridge(price, weight, coldCameraCapacity,freezerCapacity );
                    productsArray.add(fridge);
                };
                break;
                case ("IRON"):
                {
                    double maxPower = scanner.nextDouble();
                    boolean steamMaker = scanner.nextBoolean();
                    Iron iron = new Iron(price, weight, maxPower,steamMaker );
                    productsArray.add(iron);
                };
                break;
                case ("MICROWAVE"):
                {
                    double maxWavePower = scanner.nextDouble();
                    MicroWave microWave = new MicroWave(price, weight, maxWavePower);
                    productsArray.add(microWave);
                };
                break;
                default:
                    //throw Exception;
            }
        } while (scanner.hasNext());
        return productsArray;
    }
}
