package com.psjw.designpatterns._01_creational_patterns._02_factory_method._01_before;

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
        Client client = new Client();

        Ship whiteship = ShipFactory.orderShip("Whiteship", "psjw@aaa.com");
        System.out.println(whiteship);

        Ship blackship = ShipFactory.orderShip("Blackship", "psjw@aaa.com");
        System.out.println(blackship);
    }
}
