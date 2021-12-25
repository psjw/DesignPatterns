package com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._02_after
 * fileName : Blackship
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public class Blackship extends Ship {
    public Blackship(){
        setName("blackship");
        setColor("black");
        setLogo("⚓");
    }
}
