package com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

/**
 * packageName : com.psjw.designpatterns._01_creational_patterns._03_abstract_factory._03_java
 * fileName : DocumentBuilderFactoryExample
 * author : psjw
 * date : 2021-12-08
 * description :
 * ===========================================================
 * DATE              AUTHOR          NOTE
 * -----------------------------------------------------------
 * 2021-12-08        psjw         최초 생성
 */
public class DocumentBuilderFactoryExample {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        // HTML,XML 형식의문서를 자바의 OBJECT형태로 파싱해서 볼수있음
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/config.xml"));
        System.out.println(document.getDocumentElement());
    }
}
