package com.psjw.designpatterns._01_creational_patterns._04_builder._05_java;

import lombok.Builder;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._04_java
 * fileName : LombokExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
@Builder
public class LombokExample {
    private String title;
    private int nights;
    private int days;

    public static void main(String[] args) {
        LombokExample trip = LombokExample.builder().title("여행").nights(2).days(3).build();

    }
}
