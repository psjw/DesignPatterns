package com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._02_after
 * fileName : Whiteship
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public class Whiteship extends Ship {
    public Whiteship(){
        setName("whiteship");
        setLogo("\uD83D\uDEE5");
        setColor("white");
    }
}
