package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before;


import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.ship.Ship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._03_after_two
 * fileName : DefaultShipFactory
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
//자바 8인경우 -> 추상메서드를 둔다.
public abstract class DefaultShipFactory implements ShipFactory {
    @Override
    public Ship orderShip(String name, String email) {
        validate(name, email);
        prepareFor(name);
        //ship 만드는 과정은 하위클래스에 위임
        Ship ship = createShip();
        //notify
        sendEmailTo(email, ship);
        return ship;
    }

    @Override
    public void validate(String name, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("배이름을 지어주세요.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

    @Override
    public void prepareFor(String name) {
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

}
