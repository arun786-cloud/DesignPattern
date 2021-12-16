package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class Sugar extends CoffeeDecorator {
    private final Coffee coffee;

    public Sugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + .30;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with sugar";
    }
}
