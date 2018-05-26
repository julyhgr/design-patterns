package com.printsky.factorypattern.factory;

public class BenzDriver implements Driver {
    @Override
    public Car chooseCar() {
        return new Benz();
    }
}
