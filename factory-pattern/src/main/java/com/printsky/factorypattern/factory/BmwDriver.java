package com.printsky.factorypattern.factory;

public class BmwDriver implements Driver {
    @Override
    public Car chooseCar() {
        return new  Bmw();
    }
}
