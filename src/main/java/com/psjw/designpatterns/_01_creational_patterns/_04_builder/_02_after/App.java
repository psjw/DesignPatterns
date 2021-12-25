package com.psjw.designpatterns._01_creational_patterns._04_builder._02_after;


import java.time.LocalDate;

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
        TourPlanBuilder builder = new DefaultTourBuilder();
        TourPlan plan = builder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐풀기")
                .addPlan(0, "저녁식사")
                .getPlan();
        TourPlan longBeachTrip = builder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
        System.out.println(longBeachTrip);
        System.out.println(plan);
    }
}
