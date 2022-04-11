package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.ship.Ship;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after
 * fileName : ShipInventory
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class ShipInventory {
    public static void main(String[] args) {
        //어떤 제품군을 넣어주느냐에 따라 달라짐
        ShipFactory shipFactory = new WhiteshipFactory(new WhitePartsProFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());

    }
}
