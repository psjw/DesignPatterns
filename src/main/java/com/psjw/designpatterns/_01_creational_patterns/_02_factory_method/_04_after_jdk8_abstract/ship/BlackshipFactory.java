package com.psjw.designpatterns._01_creational_patterns._02_factory_method._04_after_jdk8_abstract.ship;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._04_after_jdk8_abstract.DefaultShipFactory;

public class BlackshipFactory extends DefaultShipFactory {
    @Override
    public Ship createShip() {
        return new Blackship();
    }
}
