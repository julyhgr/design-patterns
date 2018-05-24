package com.printsky.factorypattern.staticfactory;

/**
 * @author printsky
 * 具体产品
 */
public class Audi implements Car {
    @Override
    public void run() {
        System.out.println("Audi run");
    }

}
