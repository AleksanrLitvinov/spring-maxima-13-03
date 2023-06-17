package ru.maxima.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("ru.maxima.spring")
@PropertySource("classpath:application.properties")
public class SpringConfig {

    @Bean
    public Music getMusic1() {
        return new Music("P.Lion-Dream");
    }
    @Bean
    public Music getMusic2() {
        return new Music("Mike Rogers-Just A Story");
    }
    @Bean
    public Music getMusic3() {
        return new Music("Eddy Huntington-U.S.S.R.");
    }

    @Bean
    public RockRadio getRockRadio() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(getMusic1());
        musicList.add(getMusic2());
        musicList.add(getMusic3());
        return new RockRadio(musicList);
    }

    @Bean
    public RetroRadio getRetroRadio() {
        List<Music> musicList = new ArrayList<>();
        musicList.add(getMusic1());
        musicList.add(getMusic2());
        musicList.add(getMusic3());
        return new RetroRadio(musicList);
    }
    @Bean
    public MusicPlayer getMusicPlayer(){
        List<Radio> radioList = new ArrayList<>();
        radioList.add(getRetroRadio());
        radioList.add(getRockRadio());
        return new MusicPlayer(radioList);
    }
}
