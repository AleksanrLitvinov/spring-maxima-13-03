package ru.maxima.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        TestBean testBean = context.getBean("firstBean", TestBean.class);
//        System.out.println(testBean.getName());
//        context.close();
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer musicPlayer = new MusicPlayer(
//                context.getBean("retroRadio", RetroRadio.class));
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getRadio());
        System.out.println(musicPlayer.getNameOfRadioFrequency());
        System.out.println(musicPlayer.getStartRadio());
        System.out.println(musicPlayer.getEndRadio());
        context.close();
    }
}
