package com.psjw.designpatterns._01_creational_patterns._04_builder._04_after_variable_low;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._04_builder._02_after
 * fileName : DefaultTourBuilder
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class DefaultTourBuilder implements TourPlanBuilder {

    //필드의 중복 제거 Builder와 TourPlan 두개다 동시에 가지고 있음
    private TourPlan tourPlan;

    public TourPlanBuilder newInstance(){
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder nightsAndDays(int nights, int days) {
        this.tourPlan.setNights(nights);
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder title(String title) {
        this.tourPlan.setTitle(title);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder whereToStay(String whereToStay) {
        this.tourPlan.setWhereToStay(whereToStay);
        return this;
    }

    @Override
    public TourPlanBuilder addPlan(int day, String plan) {
        if (this.tourPlan.getPlans() == null) {
            this.tourPlan.setPlans(new ArrayList<>());
        }

        this.tourPlan.getPlans().add(new DetailPlan(day, plan));
        return this;
    }


    @Override
    public TourPlan getPlan() {
        return this.tourPlan;
    }
}
