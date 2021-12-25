package com.psjw.designpatterns._01_creational_patterns._04_builder._05_java;

import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._04_java
 * fileName : SpringExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class SpringExample {
    public static void main(String[] args) {
        UriComponents howToStudy = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("www.whiteship.me")
                .path("java-palylist-ep1")
                .build().encode();
        System.out.println(howToStudy);
    }
}
