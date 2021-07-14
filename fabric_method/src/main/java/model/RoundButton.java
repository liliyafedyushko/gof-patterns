package model;

public class RoundButton implements Button {

    @Override
    public void onClick(int times) {
        System.out.println("You clicked on RoundButton" + times + " times");
    }

    @Override
    public void render() {
        System.out.println("RoundButton is rendered");
    }
}
