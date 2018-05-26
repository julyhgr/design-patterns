package com.printsky.factorypattern.abstractfactory;

public class BmwAirConditioning implements AirConditioning {
    @Override
    public void createAirConditioning() {
        System.out.println(" create Bmw Air Conditioning");
    }
}
