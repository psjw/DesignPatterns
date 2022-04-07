package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class SingletonApp {
    public static void main(String[] args) {
        //동일하지 않다.
        Settings1 settings1 = Settings1.getInstance();
        Settings1 settings2 = Settings1.getInstance();
        System.out.println(settings1 == settings2);

        //멀티 쓰레드 환경에 코드가 안전하지 않다.
        Settings2 settings3 = Settings2.getInstance();
        System.out.println(settings3 == Settings2.getInstance());
    }

}
