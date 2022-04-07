package com.psjw.designpatterns._01_creational_patterns._01_singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDestroyApp {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings6 settings1 = Settings6.getInstance();
        Settings6 settings2 = Settings6.getInstance();
        System.out.println(settings1 == settings2);

        //싱글톤 깨뜨리는 1번째 방법 : 리플렉션 사용
        Constructor<Settings6> constructor = Settings6.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Settings6 settings3 = constructor.newInstance(); //새로운 객체 생성
        System.out.println(settings1 == settings3);

        //싱글톤 깨뜨리는 2번째 방법 : 직렬화 & 역직렬화 사용하기
        //파일에 객체가 써짐
        Settings7 settings4 = Settings7.getInstance();
        Settings7 settings5 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings4);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings5 = (Settings7) in.readObject();
        }
        System.out.println(settings5 == settings4);


        //싱글톤 깨뜨리는 2번째 방법 방지 : 직렬화 & 역직렬화 
        Settings8 settings6 = Settings8.getInstance();
        Settings8 settings7 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings6);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings7 = (Settings8) in.readObject();
        }
        System.out.println(settings6 == settings7);


        //리플렉션은 대응이 되지 않음
        //싱글톤 깨뜨리는 1번째, 2번째 방법 모두 방지
        Settings9 settings8 = null;
        Constructor<?>[] declaredConstructors = Settings9.class.getDeclaredConstructors();
        for(Constructor<?> constructor1 : declaredConstructors){
            constructor1.setAccessible(true);
            //Cannot reflectively create enum objects
            settings8 = (Settings9) constructor1.newInstance("INSTANCE");
        }
        Settings9 settings9 = Settings9.INSTANCE;
        Settings9 settings10 = null;
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings9);
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings10 = (Settings9) in.readObject();
        }
        System.out.println(settings9 == settings10);


    }
}

