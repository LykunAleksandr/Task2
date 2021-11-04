package by.epam.task2.bean;

import java.util.Objects;

public class Iron extends Product {
    private double maxPower;
    private boolean steamMaker;

    public Iron(double price, double weight, double maxPower, boolean steamMaker) {
        super(price, weight);
        this.maxPower = maxPower;
        this.steamMaker = steamMaker;
    }

    public double getMaxPower() {
        return maxPower;
    }

    public boolean isSteamMaker() {
        return steamMaker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Iron iron = (Iron) o;
        return Double.compare(iron.maxPower, maxPower) == 0 &&
                steamMaker == iron.steamMaker;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxPower, steamMaker);
    }

    @Override
    public String toString() {
        return "Iron{" + super.toString() +
                " maxPower=" + maxPower +
                ", steamMaker=" + steamMaker +
                "}" ;
    }
}
