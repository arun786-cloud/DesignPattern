package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class Espresso extends Coffee {
    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
