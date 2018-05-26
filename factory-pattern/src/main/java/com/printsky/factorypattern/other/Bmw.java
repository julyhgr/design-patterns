package com.printsky.factorypattern.other;

/**
 * @author printsky
 * 具体产品
 */
public class Bmw extends Car {
    @Override
    public void run() {
        System.out.println(" Bmw run");
    }

    public static String getName() {
        return "Bmw";
    }
}
