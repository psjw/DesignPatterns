package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after;


import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.ship.Ship;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.ship.Whiteship;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before
 * fileName : WhiteshipFactory6
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class WhiteshipFactory extends DefaultShipFactory {
    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        // 코드가 바뀌지 않으면서 제품군을 늘려야됨
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
