package com.psjw.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

//역직렬화 사용하기 위해 implements Serializable 사용
public class Settings7 implements Serializable {


    private Settings7(){}

    //static inner 클래스 사용하기
    private static class SettingsHolder{
        private static final Settings7 INSTANCE = new Settings7();
    }


    //멀티스레드 환경에서도 안전
    //getInstance 호출될떄 인스턴스 생성되어 lazy loading 가능
    public static Settings7 getInstance(){

        return SettingsHolder.INSTANCE;
    }
}
