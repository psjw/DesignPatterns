package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java.ship.Ship;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java
 * fileName : FactoryBeanExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class FactoryBeanExample {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config.xml");
        Ship whiteship = applicationContext.getBean("whiteship",Ship.class);
        System.out.println(whiteship.getName());

        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(FactoryBeanConfig.class);
        Ship bean = applicationContext1.getBean(Ship.class);
        System.out.println(bean);

    }
}
