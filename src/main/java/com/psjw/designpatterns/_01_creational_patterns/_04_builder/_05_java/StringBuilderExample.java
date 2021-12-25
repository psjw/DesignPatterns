package com.psjw.designpatterns._01_creational_patterns._04_builder._05_java;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._04_java
 * fileName : StringBuilderExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.append("whiteship").append("psjw").toString();
        System.out.println(result);
    }
}
