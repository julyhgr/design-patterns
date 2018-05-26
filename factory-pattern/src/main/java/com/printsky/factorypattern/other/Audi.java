package com.printsky.factorypattern.other;

/**
 * @author printsky
 * 具体产品
 */
public class Audi extends Car {
    @Override
    public void run() {
        System.out.println(" Audi run");
    }

    public static String getName() {
        return "Audi";
    }
}
