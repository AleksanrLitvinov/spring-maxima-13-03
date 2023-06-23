package ru.maxima.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.Annotation;

public class Main {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        TestBean testBean = context.getBean("firstBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();

//        MusicPlayer musicPlayer = new MusicPlayer(
//                context.getBean("retroRadio", RetroRadio.class));

//        System.out.println(musicPlayer.getRadio());
//        System.out.println(musicPlayer.getNameOfRadioFrequency());
//        System.out.println(musicPlayer.getStartRadio());
//        System.out.println(musicPlayer.getEndRadio());

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

        MusicPlayer musicPlayer1 = context.getBean("getMusicPlayer", MusicPlayer.class);


        musicPlayer1.playMusic();

        context.close();
    }
}
