package model;

public abstract class Beverage {

    public abstract String getDescription();

    public abstract double cost();

    @Override
    public String toString() {
        return "Beverage{" +
                "description='" + this.getDescription() + '\'' +
                "cost=$" + cost() +
                '}';
    }
}
