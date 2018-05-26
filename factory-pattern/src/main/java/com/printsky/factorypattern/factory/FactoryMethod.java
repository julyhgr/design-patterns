package com.printsky.factorypattern.factory;

public class FactoryMethod {
    public static void main(String[] args) {
        Driver driver=new BmwDriver();
        Car car = driver.chooseCar();
        car.run();


        Driver benzDriver = new BenzDriver();
        Car car1 = benzDriver.chooseCar();
        car1.run();
    }
}
