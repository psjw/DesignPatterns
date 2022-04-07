package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class Settings1 {
    private Settings1(){}

    public static Settings1 getInstance(){
        return new Settings1();
    }
}
