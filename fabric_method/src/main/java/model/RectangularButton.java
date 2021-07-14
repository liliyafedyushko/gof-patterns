package model;

public class RectangularButton implements Button {
    @Override
    public void onClick(int times) {
        System.out.println("You clicked on RectangularButton" + times + " times");
    }

    @Override
    public void render() {
        System.out.println("RectangularButton is rendered");
    }
}
