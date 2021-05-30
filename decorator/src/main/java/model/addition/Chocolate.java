package model.addition;

import model.Beverage;
import model.AdditionDecorator;

public class Chocolate extends AdditionDecorator {

    private final Beverage beverage;

    public Chocolate(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .35 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Chocolate";
    }
}
