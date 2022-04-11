package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._01_factorymethod;


public abstract class Car {
    String carType;

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                '}';
    }
}
