package com.psjw.designpatterns._01_creational_patterns._04_builder._04_after_variable_low;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._02_after
 * fileName : App
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class App {
    public static void main(String[] args) {
        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
        System.out.println(tourPlan1);
    }
}
