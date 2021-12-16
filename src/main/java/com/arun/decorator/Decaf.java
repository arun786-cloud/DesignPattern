package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class Decaf extends Coffee {
    public Decaf() {
        description = "decaf";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
