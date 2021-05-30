package model;
/*
* Decorator extends Beverage so all classes that will extend it will be beverages
* and will have it's (Beverage's) properties
* but as Decorator is abstract it doesn't have to have cost method
*/
public abstract class AdditionDecorator extends Beverage{

    public abstract String getDescription();

}
