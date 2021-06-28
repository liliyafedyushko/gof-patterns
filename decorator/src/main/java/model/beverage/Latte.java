package model.beverage;

import model.Beverage;

public class Latte extends Beverage {

    @Override
    public String getDescription(){
        return "Latte";
    }

    @Override
    public double cost() {
        return 2.59;
    }
}
