package com.psjw.designpatterns._01_creational_patterns._01_singleton;

/**
 * packageName : com.psjw.designpatterns.singleton
 * fileName : Settings
 * author : psjw
 * date : 2021-11-30
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-11-30        psjw         최초 생성
 */
public class Settings2 {
    private static Settings2 instance;

    private Settings2(){}

    public static Settings2 getInstance(){
        if(instance==null){
            instance = new Settings2();
        }
        return instance;
    }
}
