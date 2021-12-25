package com.psjw.designpatterns._01_creational_patterns._01_singleton;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * packageName : com.psjw.designpatterns.singleton
 * fileName : SpringConfig
 * author : psjw
 * date : 2021-11-30
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-11-30        psjw         최초 생성
 */
@Configuration
public class SpringConfig {
    @Bean
    public String hello(){
        return "hello";
    }
}
