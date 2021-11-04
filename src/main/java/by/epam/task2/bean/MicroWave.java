package by.epam.task2.bean;

import java.util.Objects;

public class MicroWave extends Product {
    private double maxWavePower;

    public MicroWave(double price, double weight, double maxWavePower) {
        super(price, weight);
        this.maxWavePower = maxWavePower;
    }

    public double getMaxWavePower() {
        return maxWavePower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MicroWave microWave = (MicroWave) o;
        return Double.compare(microWave.maxWavePower, maxWavePower) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxWavePower);
    }

    @Override
    public String toString() {
        return "MicroWave{" + super.toString() +
                "power=" + maxWavePower +
                "}";
    }
}
