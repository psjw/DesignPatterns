package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._01_factorymethod;

public abstract class CarFactory {
    public abstract Car createCar(String name);

    public abstract Car returnCar(String name);

    public void numbering(Car car) {
        System.out.println("numbering");
    }

    public void washCar(Car car) {
        System.out.println("washcar");
    }

    public void sellCar(String name){
        Car car = createCar(name);
        numbering(car);
        washCar(car);
    }
}
