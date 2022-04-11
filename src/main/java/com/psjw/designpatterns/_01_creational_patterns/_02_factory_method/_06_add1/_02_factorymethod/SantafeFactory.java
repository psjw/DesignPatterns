package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._02_factorymethod;

public class SantafeFactory extends HyundaiCarFactory{
    @Override
    public Car createCar() {
        return new Santafe();
    }

}
