package com.psjw.designpatterns._01_creational_patterns._02_factory_method._05_java;

import com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after.ship.Blackship;
import com.psjw.designpatterns._01_creational_patterns._02_factory_method._02_after.ship.Whiteship;

/**
 * packageName : com.psjw.designpatterns.factorymethod._05_java
 * fileName : SimpleFactory
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class SimpleFactory {
    
    //Simple Factory 패턴 -> 자바의 캘린더가 이런식으로 사용됨
    public Object createProduct(String name){
        if(name.equals("whiteship")){
            return new Whiteship();
        }else if(name.equals("blackship")){
            return new Blackship();
        }
        throw new IllegalArgumentException();
    }
}
