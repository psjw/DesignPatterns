package com.psjw.designpatterns._01_creational_patterns._04_builder._05_java;

import java.util.stream.Stream;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._04_java
 * fileName : StreamExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringBuilder = Stream.builder();
        Stream<String> names = stringBuilder.add("psjw").add("whiteship").build();
        names.forEach(System.out::println);

        Stream<String> names1 = Stream.<String>builder().add("psjw").add("whiteship").build();
        names1.forEach(System.out::println);
    }
}
