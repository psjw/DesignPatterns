package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Anchor;
import com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after.parts.Wheel;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._02_after
 * fileName : ShipPartsFactory
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
//OCP -> 소스코드변경이 없음
public interface ShipPartsFactory {
    Anchor createAnchor();

    Wheel createWheel();
}
