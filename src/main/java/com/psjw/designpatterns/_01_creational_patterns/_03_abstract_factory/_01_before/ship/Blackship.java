package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._01_before.ship;

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
