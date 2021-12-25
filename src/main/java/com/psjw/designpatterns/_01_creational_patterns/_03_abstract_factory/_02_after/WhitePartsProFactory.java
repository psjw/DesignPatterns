package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Anchor;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Wheel;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.WhiteAnchorPro;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.WhiteWheelPro;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after
 * fileName : WhitePartsProFactory
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class WhitePartsProFactory implements ShipPartsFactory{
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchorPro();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheelPro();
    }
}
