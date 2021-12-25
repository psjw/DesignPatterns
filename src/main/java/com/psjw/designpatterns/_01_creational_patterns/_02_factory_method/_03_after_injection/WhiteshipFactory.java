package com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.Ship;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.ShipFactory;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.Whiteship;

/**
 * packageName : com.psjw.designpatterns.factorymethod.before_01
 * fileName : ShipFactory
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
