package ru.maxima.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class RockRadio implements Radio {


   private List<Music> music;

    public RockRadio(List<Music> music) {
        this.music = music;
    }
    @Override
    public Music playMusic() {
        Random random = new Random();
        return music.get(random.nextInt(music.size()));
    }

    @Override
    public String getSong() {
        return "Franz Ferdinant - Take ma out";
    }
}
