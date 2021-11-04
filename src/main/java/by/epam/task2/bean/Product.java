package by.epam.task2.bean;

import java.util.Objects;

public abstract class Product {
    private double price;
    private double weight;

    public Product(double price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 &&
                Double.compare(product.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, weight);
    }

    @Override
    public String toString() {
        return " price=" + price +
                ", weight=" + weight +
                " ";
    }
}
