package com.printsky.factorypattern.other;

/**
 * @author printsky
 * 抽象产品
 */
public abstract class Car {
    public abstract void run();

    public static String getName() {
        return "Car";
    }
}
