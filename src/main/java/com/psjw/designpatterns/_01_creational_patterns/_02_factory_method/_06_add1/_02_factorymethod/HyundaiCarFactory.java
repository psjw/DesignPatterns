package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._02_factorymethod;

import java.util.HashMap;

public abstract class HyundaiCarFactory implements CarFactory {
    HashMap<String, Car> hashMap = new HashMap<>();

    @Override
    public void sellCar(){
        Car car = createCar();
        numbering(car);
        washCar(car);
    }
    public void numbering(Car car) {
        System.out.println(car+" numbering");
    }

    public void washCar(Car car) {
        System.out.println(car+" washcar");
    }
}
