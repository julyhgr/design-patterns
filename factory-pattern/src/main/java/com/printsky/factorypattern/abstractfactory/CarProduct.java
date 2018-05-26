package com.printsky.factorypattern.abstractfactory;

public interface CarProduct {

    Engine chooseEngine();

    AirConditioning chooseAirConditioning();

}
