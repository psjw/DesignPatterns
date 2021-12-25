package com.psjw.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * packageName : com.psjw.designpatterns.singleton
 * fileName : SpringExample
 * author : psjw
 * date : 2021-11-30
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-11-30        psjw         최초 생성
 */
public class SpringExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        //singleton scope : 인스턴스를 ApplicationContext안에서 유일한 객체로 관리 (싱글톤 패턴이 아님)
        String hello = applicationContext.getBean("hello", String.class);
        String hello2 = applicationContext.getBean("hello", String.class);
        System.out.println(hello == hello2);
    }
}
