package com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after.ship.Ship;

public interface ShipFactory {
    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);
        //ship 만드는 과정은 하위클래스에 위임
        Ship ship = createShip();
        //notify
        sendEmailTo(email, ship);
        return ship;
    }

    private void sendEmailTo(String email, Ship ship){
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    Ship createShip();

    private void validate(String name, String email){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    private void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

}
