package model.beverage;

import model.Beverage;

public class Cappuccino extends Beverage {

    @Override
    public String getDescription(){
        return "Cappuccino";
    }

    @Override
    public double cost() {
        return 3.19;
    }
}
