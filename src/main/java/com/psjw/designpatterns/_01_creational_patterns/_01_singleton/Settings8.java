package com.psjw.designpatterns._01_creational_patterns._01_singleton;

import java.io.Serializable;

//역직렬화 사용하기 위해 implements Serializable 사용
public class Settings8 implements Serializable {


    private Settings8(){}

    //static inner 클래스 사용하기
    private static class SettingsHolder{
        private static final Settings8 INSTANCE = new Settings8();
    }


    //멀티스레드 환경에서도 안전
    //getInstance 호출될떄 인스턴스 생성되어 lazy loading 가능
    public static Settings8 getInstance(){

        return SettingsHolder.INSTANCE;
    }

    //역직렬화 대응 방안
    //readResolve()를 사용하여 역직렬화
    protected  Object readResolve(){
        return getInstance();
    }
}
