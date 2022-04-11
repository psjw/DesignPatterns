package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._01_factorymethod;

public class CarTest {
    public static void main(String[] args) {
        CarFactory factory = new HyundaiCarFactory();
        Car newCar = factory.createCar("sonata");
        System.out.println(newCar);

        Car myCar = factory.returnCar("Tomas");
        Car hisCar = factory.returnCar("Tomas");
        System.out.println(myCar == hisCar);
    }
}
