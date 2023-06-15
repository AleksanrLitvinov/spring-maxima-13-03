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

import java.util.List;

public class MusicPlayer {
//    private Radio rockRadio;
//
//    public MusicPlayer(Radio rockRadio) {
//        this.rockRadio = rockRadio;
//    }

    private Radio radio;
    private String nameOfRadioFrequency;
    private double startRadio;
    private double endRadio;

    private List<Music> musicList;


//    public MusicPlayer(Radio radio) {
//        this.radio = radio;
//    }


    public void setRadio(Radio radio) {
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


    public void playMusic() {
       // radio = new RetroRadio();
//        System.out.println("On air \n" + radio.getSong());

        for (Music music : musicList) {
            System.out.println(music.getName());
        }

    }
}
