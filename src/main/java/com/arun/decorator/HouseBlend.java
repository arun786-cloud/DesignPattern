package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class HouseBlend extends Coffee {
    public HouseBlend() {
        description = "house blend";
    }

    @Override
    public double cost() {
        return 1.5;
    }
}
