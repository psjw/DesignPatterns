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
//장점 : 역직렬화 , 리플렉션 방지
//단점 :  클래스를 로딩하는 순간 미리 만들어 짐, 상속이 되지 않음 -> enum 끼리만 컴파일 시점에 상속됨
public enum Settings9{
    INSTANCE;
}
