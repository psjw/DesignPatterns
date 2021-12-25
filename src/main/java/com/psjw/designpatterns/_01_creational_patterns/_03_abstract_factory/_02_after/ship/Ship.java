package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.ship;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Anchor;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Wheel;

/**
 * packageName : com.psjw.designpatterns.factorymethod.before_01
 * fileName : Ship
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
//Ship이 바뀌면 OCP 위배 
//구체적인 클래스 -> 만들어 클래스의 특성이 있으면 바뀌어야함-> 기존 코드 변경-> 변경에 닫혀있지 않음
public class Ship {
    private String name;
    private String color;
    private String logo;
    private Anchor anchor;
    private Wheel wheel;

    public Ship() {
    }

    public Anchor getAnchor() {
        return anchor;
    }

    public void setAnchor(Anchor anchor) {
        this.anchor = anchor;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public Ship(String name, String color, String logo, Anchor anchor, Wheel wheel) {
        this.name = name;
        this.color = color;
        this.logo = logo;
        this.anchor = anchor;
        this.wheel = wheel;
    }
}
