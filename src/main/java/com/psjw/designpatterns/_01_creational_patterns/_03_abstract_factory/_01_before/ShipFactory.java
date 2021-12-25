package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before;


import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.ship.Ship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._02_after
 * fileName : ShipFactory
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public interface ShipFactory {
    Ship orderShip(String name, String email);

    void sendEmailTo(String email, Ship ship);

    Ship createShip();

    void validate(String name, String email);

    void prepareFor(String name);

}
