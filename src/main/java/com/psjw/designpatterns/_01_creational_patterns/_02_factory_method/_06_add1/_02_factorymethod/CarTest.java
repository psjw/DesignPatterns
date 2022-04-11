package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._02_factorymethod;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new SantafeFactory();
        factory.sellCar();

        new SonataFactory().sellCar();

        new AvanteFactory().sellCar();

    }
}
