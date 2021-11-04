package by.epam.task2.Main;

import by.epam.task2.service.ImplProductService;

public class Main {

    public static void main(String[] args) {

        ImplProductService service = new ImplProductService();
        System.out.println(service.getProductList());


    }
}
