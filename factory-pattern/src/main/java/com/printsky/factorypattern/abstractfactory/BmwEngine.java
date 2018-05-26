package com.printsky.factorypattern.abstractfactory;

public class BmwEngine implements Engine {
    @Override
    public void createEngine() {
        System.out.println(" create Bmw Engine ");
    }
}
