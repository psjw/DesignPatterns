package com.psjw.designpatterns._01_creational_patterns._02_factory_method._05_java;

import java.util.Calendar;
import java.util.Locale;

/**
 * packageName : com.psjw.designpatterns.factorymethod._05_java
 * fileName : CalendarExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class CalendarExample {
    public static void main(String[] args) {
        //파라미터에 따라 다른 캘린더 반환
        System.out.println(Calendar.getInstance().getClass());//class java.util.GregorianCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());//class sun.util.BuddhistCalendar
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());//class java.util.JapaneseImperialCalendar
    }
}
