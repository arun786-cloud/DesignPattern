# DesignPattern
## Decorator Pattern

### class diagram

![Decorator Pattern](https://github.com/arun786-cloud/DesignPattern/blob/main/src/main/resources/images/decorator.png)

Client call

        package com.arun.main;

        import com.arun.decorator.*;
        
        import java.io.FileInputStream;
        import java.io.FilterInputStream;
        import java.io.InputStream;
        
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


        O/P
        
        Espresso : cost 1.99
        Espresso, with milk : cost 2.19
        Espresso, with milk, with sugar : cost 2.4899999999999998
        Dark Roast : cost 1.2
        Dark Roast with mocha with mocha : cost 1.8
        
