package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class Settings2 {
    //global access 가능하도록
    private static Settings2 instance;

    private Settings2(){}

    public static Settings2 getInstance(){
        if(instance==null){
            instance = new Settings2();
        }
        return instance;
    }
}
