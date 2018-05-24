package com.printsky.factorypattern.staticfactory;

/**
 * @author printsky
 * 具体产品
 */
public class Benz implements Car {
    @Override
    public void run() {
        System.out.println(" Benz run");
    }
}
