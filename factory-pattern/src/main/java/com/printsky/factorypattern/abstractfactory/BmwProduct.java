package com.printsky.factorypattern.abstractfactory;

public class BmwProduct  implements CarProduct{

    @Override
    public Engine chooseEngine() {
        return new BmwEngine();
    }

    @Override
    public AirConditioning chooseAirConditioning() {
        return new BmwAirConditioning();
    }
}
