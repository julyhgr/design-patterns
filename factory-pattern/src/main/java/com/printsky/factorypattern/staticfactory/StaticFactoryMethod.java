package com.printsky.factorypattern.staticfactory;

/**
 * @author printsky
 * 工厂类角色
 */
public class StaticFactoryMethod {
    public static void drive(String carName) {
        Car car;
        if ("Bmw".equals(carName)) {
            car = new Bmw();
        } else if ("Benz".equals(carName)) {
            car = new Benz();
        } else if ("Audi".equals(carName)) {
            car = new Audi();
        } else {
            return;
        }
        car.run();
    }

    public static void main(String[] args) {
        drive("Bmw");
        drive("Benz");
        drive("Audi");
    }
}

