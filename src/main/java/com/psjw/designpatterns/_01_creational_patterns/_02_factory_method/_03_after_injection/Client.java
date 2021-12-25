package com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._03_after_injection.ship.ShipFactory;

/**
 * packageName : com.psjw.designpatterns.factorymethod.before_01
 * fileName : Client
 * author : psjw
 * date : 2021-12-07
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-07        psjw         최초 생성
 */
public class Client {
    public static void main(String[] args) {
        //클라이언트 코드 변경 -> 의존성 주입 방법 사용시 클라이언트 코드 변경 안해도됨
        Client client = new Client();
        client.print(new WhiteshipFactory(), "whiteship", "aaa@bbb.com");
        client.print(new BlackshipFactory(), "blackship", "ccc@ddd.com");
    }

    private void print(ShipFactory shipFactory, String name, String email) {
        System.out.println(shipFactory.orderShip(name, email));
    }
}
