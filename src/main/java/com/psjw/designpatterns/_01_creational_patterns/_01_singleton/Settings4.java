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
public class Settings4 {
    //이른 초기화 (eager initialization) 사용하기
    //단점 : 인스턴스 만드는 과정이 길고 메모리를 많이 차지 한다면 안쓰는 객체를 미리 로딩
    private static final Settings4 INSTANCE = new Settings4();
    
    private Settings4(){}

    public static Settings4 getInstance(){
        return INSTANCE;
    }
}
