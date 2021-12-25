package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java.ship.Ship;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java.ship.Whiteship;
import org.springframework.beans.factory.FactoryBean;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java
 * fileName : ShipFactory
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */

//BEAN을 만들때 만드는 과정이 단순하게 NEW가 아닌 복잡한과정을 거치는 경우에 사용
public class ShipFactory implements FactoryBean<Ship> {
    @Override
    public Ship getObject() throws Exception {
        Ship ship = new Whiteship();
        ship.setName("whiteship");
        return ship;
    }

    @Override
    public Class<?> getObjectType() {
        return Ship.class;
    }
}
