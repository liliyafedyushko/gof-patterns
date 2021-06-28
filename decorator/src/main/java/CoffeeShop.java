import model.Beverage;
import model.addition.Chocolate;
import model.addition.SoyMilk;
import model.addition.Whip;
import model.beverage.Cappuccino;
import model.beverage.Latte;

public class CoffeeShop {

    public static void main(String[] args) {

        Beverage beverage1 = new Latte();
        System.out.println(beverage1);

        Beverage beverage2 = new Cappuccino();
        beverage2 = new SoyMilk(beverage2);
        beverage2 = new Whip(beverage2);
        beverage2 = new Chocolate(beverage2);
        System.out.println(beverage2);
    }
}
