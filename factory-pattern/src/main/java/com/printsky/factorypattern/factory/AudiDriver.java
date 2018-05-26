package com.printsky.factorypattern.factory;

public class AudiDriver implements Driver {
    @Override
    public Car chooseCar() {
        return new Audi();
    }
}
