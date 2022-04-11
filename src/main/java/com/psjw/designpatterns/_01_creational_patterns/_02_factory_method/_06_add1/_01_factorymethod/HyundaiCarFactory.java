package com.psjw.designpatterns._01_creational_patterns._02_factory_method._06_add1._01_factorymethod;

import java.util.HashMap;

public class HyundaiCarFactory extends CarFactory {
    //이미등록된 객체는 반환해줌
    HashMap<String, Car> carMap = new HashMap<>();
    
    @Override
    public Car createCar(String name) {
        Car car = null;

        if (name == "sonanta") {
            car = new Sonata();
        } else if (name == "santafe") {
            car = new Santafe();
        }
        return car;
    }

    @Override
    public Car returnCar(String name){
        Car car = carMap.get(name);
        if(car == null){
            if(name.equals("Tomas")){
                car = new Sonata();
            }else if(name.equals("James")){
                car = new Santafe();
            }
            carMap.put(name, car);
        }
        return car;
    }
}
