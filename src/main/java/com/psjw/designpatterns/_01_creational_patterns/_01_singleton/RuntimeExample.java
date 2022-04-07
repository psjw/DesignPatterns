package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class RuntimeExample {
    public static void main(String[] args) {
        //java 어플리케이션 실행환경
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());

    }
}
