package com.psjw.designpatterns._01_creational_patterns._05_prototype._04_java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student keesun = new Student("keesun");
        Student whiteship = new Student("whiteship");
        //자주 쓰지 않음 변수의 타입을 추상적인 타입을 사용 List를 사용
        //사용하는 이유는 더욱 유연하기 때문에
        ArrayList<Student> students = new ArrayList<>();
        students.add(keesun);
        students.add(whiteship);

        ArrayList<Student> clone = (ArrayList<Student>)students.clone();
        System.out.println(clone);


        //List에서는 Clone 지원 하지 않음,  Cloneable 상속 받지 않음
        //일반적으로 생성자를 사용
        List<Student> clone1 = new ArrayList<>(students);
        System.out.println(clone1);
        
    }
}
