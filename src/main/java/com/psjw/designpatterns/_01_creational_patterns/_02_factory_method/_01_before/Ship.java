package com.psjw.designpatterns._01_creational_patterns._02_factory_method._01_before;

//Ship이 바뀌면 OCP 위배 확장에는 열려있고 변경에는 닫혀있다.
//구체적인 클래스 -> 만들어 클래스의 특성이 있으면 바뀌어야함-> 기존 코드 변경-> 변경에 닫혀있지 않음
public class Ship {
    private String name;
    private String color;
    private String logo;

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

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", logo='" + logo + '\'' +
                '}';
    }
}
