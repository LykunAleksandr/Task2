package by.epam.task2.bean;

import java.util.Objects;

public class Fridge extends Product{
    private double coldCameraCapacity;
    private double freezerCapacity;

    public Fridge(double price, double weight, double coldCameraCapacity, double freezerCapacity) {
        super(price, weight);
        this.coldCameraCapacity = coldCameraCapacity;
        this.freezerCapacity = freezerCapacity;
    }

    public double getColdCameraCapacity() {
        return coldCameraCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Fridge fridge = (Fridge) o;
        return Double.compare(fridge.coldCameraCapacity, coldCameraCapacity) == 0 &&
                Double.compare(fridge.freezerCapacity, freezerCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), coldCameraCapacity, freezerCapacity);
    }

    @Override
    public String toString() {
        return "Fridge{" + super.toString() +
                "coldCameraCapacity=" + coldCameraCapacity +
                ", freezerCapacity=" + freezerCapacity +
                '}';
    }
}
