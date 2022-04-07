package com.psjw.designpatterns._01_creational_patterns._02_factory_method._05_java;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanFactoryExample {
    public static void main(String[] args) {
        //Spring에서 제공하는 BeanFactory 구현체(디자인패턴 구현)

        //xml기반
        BeanFactory xmlFactory = new ClassPathXmlApplicationContext("config.xml");
        String hello = xmlFactory.getBean("hello", String.class);
        System.out.println(hello);
        //자바 기반
        BeanFactory javaFactory = new AnnotationConfigApplicationContext(Config.class);
        String hi = javaFactory.getBean("hello", String.class);
        System.out.println(hi);
    }
}
