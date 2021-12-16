package com.arun.decorator;

/**
 * @author arun on 11/27/21
 */
public abstract class Coffee {
    String description = "unknown coffee";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
