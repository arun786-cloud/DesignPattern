package com.arun.main;

import com.arun.decorator.*;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.InputStream;

/**
 * @author arun on 11/27/21
 */
public class DecoratorMain {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        printCoffee(espresso);

        espresso = new Milk(espresso);
        printCoffee(espresso);

        espresso = new Sugar(espresso);
        printCoffee(espresso);

        Coffee darkRoast = new DarkRoast();
        printCoffee(darkRoast);

        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        printCoffee(darkRoast);

    }

    public static void printCoffee(Coffee coffee) {
        System.out.println(coffee.getDescription() + " : cost " + coffee.cost());
    }
}
