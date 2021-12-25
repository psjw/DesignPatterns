package com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after.ship.Blackship;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after.ship.Ship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._02_after
 * fileName : BlackshipFactory
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public class BlackshipFactory implements ShipFactory{
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
