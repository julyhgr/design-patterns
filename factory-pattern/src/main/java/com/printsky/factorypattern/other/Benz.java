package com.printsky.factorypattern.other;

/**
 * @author printsky
 * 具体产品
 */
public class Benz extends Car {
    @Override
    public void run() {
        System.out.println(" Benz run");
    }

    public static String getName() {
        return "Benz";
    }
}
