package com.printsky.factorypattern.abstractfactory;

public class AbstractFactory {
    public static void main(String[] args) {
        CarProduct carProduct = new BmwProduct();
        Engine engine = carProduct.chooseEngine();
        engine.createEngine();
        AirConditioning airConditioning = carProduct.chooseAirConditioning();
        airConditioning.createAirConditioning();

    }
}
