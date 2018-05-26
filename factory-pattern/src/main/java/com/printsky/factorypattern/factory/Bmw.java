package com.printsky.factorypattern.factory;

import com.printsky.factorypattern.factory.Car;

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
