package com.psjw.designpatterns._01_creational_patterns._01_singleton;

public class Settings5 {
    //jdk 1.5부터 동작(volatile 작성해 줘야 동작)
    // Java 변수를 Main Memory에 저장하겠다라는 것을 명시 -> 매개변수의 값을 읽을 때마다 메인메모리에서 읽음(CPU 캐시가 아님)
    // 멀티쓰레드 환경에서 CPU 캐시의 값이 변경 되었을때 다른 CPU 캐시와 값이 다를 수 있기때문에 사용
    private static volatile Settings5 instance;

    private Settings5(){}

    //double checked locking 사용하기 -> if + synchronized
    //getInstance 메서드 호출시에 synchronized 걸리지 않음 -> 생성구간에서 synchronized됨 
    // 인스턴스를 필요시점에 만들 수 있음
    public static Settings5 getInstance(){
        if(instance == null){
            synchronized (Settings5.class){ //Settings5.class를 Lock으로 걸어줌
                if(instance == null){
                    instance = new Settings5();
                }
            }
        }
        return instance;
    }
}
