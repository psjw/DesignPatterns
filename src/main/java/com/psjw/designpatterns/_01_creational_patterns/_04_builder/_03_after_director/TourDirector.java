package com.psjw.designpatterns._01_creational_patterns._04_builder._03_after_director;

import java.time.LocalDate;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._02_after
 * fileName : TourDirector
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
//자주 반복 되는 경우 미리 만들어서 Director에 넣고 재사용
public class TourDirector {
    private TourPlanBuilder tourPlanBuilder;

    public TourDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan cancunTrip(){
        return tourPlanBuilder.title("칸쿤 여행")
                .nightsAndDays(2, 3)
                .startDate(LocalDate.of(2020, 12, 9))
                .whereToStay("리조트")
                .addPlan(0, "체크인하고 짐풀기")
                .addPlan(0, "저녁식사")
                .getPlan();
    }

    public TourPlan longBeachTrip(){
        return tourPlanBuilder.title("롱비치")
                .startDate(LocalDate.of(2021, 7, 15))
                .getPlan();
    }
}
