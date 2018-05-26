package com.printsky.factorypattern.other;

/**
 * @author printsky
 * 工厂类角色
 */
public class Factory {

    public static Car manufacture(String name) {
        Car car;

        if (Bmw.getName().equals(name)) {
            car = new Bmw();
        } else if (Benz.getName().equals(name)) {
            car = new Benz();
        } else if (Audi.getName().equals(name)) {
            car = new Audi();
        } else {
            return null;
        }
        return car;
    }

    public static void main(String[] args) {
        String[] cars = new String[]{"Bmw", "Benz", "Audi"};

        Driver driver = new Driver();
        Car car = Factory.manufacture(cars[0]);
        driver.drive(car);

        car = Factory.manufacture(cars[1]);
        driver.drive(car);

        car = Factory.manufacture(cars[2]);
        driver.drive(car);


//        Car car;
//        car = Driver.driveCar("Bmw");
//        car.run();
//        car = Driver.driveCar("Benz");
//        car.run();
//        car = Driver.driveCar("Audi");
//        car.run();
    }
}

