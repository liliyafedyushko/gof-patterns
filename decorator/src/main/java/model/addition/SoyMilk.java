package model.addition;

import model.Beverage;
import model.AdditionDecorator;

public class SoyMilk extends AdditionDecorator {

    // for addition to know about beverage we add link to it
    private final Beverage beverage;

    public SoyMilk(Beverage beverage) {
        this.beverage = beverage; // and set the value in constructor
    }

    //this one is overridden from Beverage
    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    // this one is overridden from Addition
    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy Milk";
    }
}
