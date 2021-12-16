package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class Milk extends CoffeeDecorator {
    private final Coffee coffee;

    public Milk(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public double cost() {
        return coffee.cost() + .20;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription() + ", with milk";
    }
}
