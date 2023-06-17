package ru.maxima.spring;
//
//interface Radio{
//
//}
//class RetroRadio implements Radio {
//
//}
//
//class RockRadio implements Radio {
//
//}

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
//@Scope("prototype")
public class MusicPlayer { //musicPlayer
//    private Radio rockRadio;
//
//    public MusicPlayer(Radio rockRadio) {
//        this.rockRadio = rockRadio;
//    }


    private Radio radio;
    private Radio radio2;
    @Value("${nameOfRadioFrequency}")
    private String nameOfRadioFrequency;
    @Value("${startRadio}")
    private double startRadio;
    @Value("${endRadio}")
    private double endRadio;


    private List<Music> musicList;
//    @Autowired
//    public MusicPlayer(@Qualifier("retroRadio") Radio radio, @Qualifier("rockRadio") Radio radio2) {
//        this.radio = radio;
//        this.radio2 = radio2;
//    }

    @Autowired
    public void setRadio(@Qualifier("retroRadio") Radio radio) {
        this.radio = radio;
    }

    public void setNameOfRadioFrequency(String nameOfRadioFrequency) {
        this.nameOfRadioFrequency = nameOfRadioFrequency;
    }

    public void setStartRadio(double startRadio) {
        this.startRadio = startRadio;
    }

    public void setEndRadio(double endRadio) {
        this.endRadio = endRadio;
    }

    public List<Music> getMusicList() {
        return musicList;
    }
    @Autowired
    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public Radio getRadio() {
        return radio;
    }

    public String getNameOfRadioFrequency() {
        return nameOfRadioFrequency;
    }

    public double getStartRadio() {
        return startRadio;
    }

    public double getEndRadio() {
        return endRadio;
    }

    @PostConstruct
    public void myInitMethod() {
        System.out.println("Doing my initialisation");
    }


    public void playMusic() {
        radio = new RetroRadio();
        System.out.println("On air \n" + radio.getSong());

//        for (Music music : musicList) {
//            System.out.println(music.getName());
//        }

    }
    @PreDestroy
    public void myDestroyMethod() {
        System.out.println("Doing my destruct");
    }
}
