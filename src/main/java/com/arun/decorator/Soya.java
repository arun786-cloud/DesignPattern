package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class Soya extends CoffeeDecorator {
    private final Coffee coffee;

    public Soya(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + .2;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + " with Soya";
    }
}
