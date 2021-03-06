package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class Settings3 {
    private static Settings3 instance;

    private Settings3(){}

    //synchronized 키워드 사용하기 -> 하나의 쓰레드만 사용 가능
    //단점은 getInstance 메서드 호출할 때마다 동기화 처리로 인해 성능이 나쁨
    //동기화 : Key가 되는 Lock을 사용해서 해당 Lock을 가지고 있는 Thread만 접근 후 사용 이후 해제
    public static synchronized Settings3 getInstance(){
        if(instance==null){
            instance = new Settings3();
        }
        return instance;
    }
}
