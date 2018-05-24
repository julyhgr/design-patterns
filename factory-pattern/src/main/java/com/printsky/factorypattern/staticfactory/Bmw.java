package com.printsky.factorypattern.staticfactory;

/**
 * @author printsky
 * 具体产品
 */
public class Bmw implements Car {
    @Override
    public void run() {
        System.out.println(" Bmw run");
    }
}
