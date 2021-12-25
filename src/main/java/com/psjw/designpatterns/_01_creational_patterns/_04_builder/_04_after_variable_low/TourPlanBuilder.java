package com.psjw.designpatterns._01_creational_patterns._04_builder._04_after_variable_low;

import java.time.LocalDate;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._02_after
 * fileName : TourPlanBuilder
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public interface TourPlanBuilder {
    TourPlanBuilder newInstance();

    //메서드 체이닝 -> TourPlanBuilder로받아서 또다른 메서드를 사용가능
    TourPlanBuilder nightsAndDays(int nights, int days);

    TourPlanBuilder title(String title);

    TourPlanBuilder startDate(LocalDate localDate);

    TourPlanBuilder whereToStay(String whereToStay);

    TourPlanBuilder addPlan(int day, String plan);

    //최종적으로 다 되었으면 getPlan() 호출 -> 데이터 검증도 가능
    TourPlan getPlan();
}
