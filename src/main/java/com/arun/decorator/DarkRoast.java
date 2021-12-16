package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public class DarkRoast extends Coffee {
    public DarkRoast() {
        description = "Dark Roast";
    }

    @Override
    public double cost() {
        return 1.2;
    }
}
