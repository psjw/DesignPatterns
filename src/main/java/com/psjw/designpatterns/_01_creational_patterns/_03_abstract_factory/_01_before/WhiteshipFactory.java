package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before;


import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.parts.WhiteAnchor;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.parts.WhiteWheel;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.ship.Ship;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.ship.Whiteship;

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
    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        // 코드가 바뀌지 않으면서 제품군을 늘려야됨
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
