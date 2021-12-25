package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java
 * fileName : FactoryBeanConfig
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
@Configuration
public class FactoryBeanConfig {

    @Bean
    public ShipFactory shipFactory(){
        return new ShipFactory();
    }
}
