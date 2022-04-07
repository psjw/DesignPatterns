package com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.Ship;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.ShipFactory;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.Whiteship;

public class WhiteshipFactory implements ShipFactory {
    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
