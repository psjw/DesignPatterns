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
public class Settings6 {


    private Settings6(){}

    //static inner 클래스 사용하기
    private static class SettingsHolder{
        private static final Settings6 INSTANCE = new Settings6();
    }


    //멀티스레드 환경에서도 안전
    //getInstance 호출될떄 인스턴스 생성되어 lazy loading 가능
    public static Settings6 getInstance(){

        return SettingsHolder.INSTANCE;
    }
}
