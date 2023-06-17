package ru.maxima.spring;

import org.springframework.stereotype.Component;

@Component
public class RockRadio implements Radio {

    @Override
    public String getSong() {
        return "Franz Ferdinant - Take ma out";
    }
}
