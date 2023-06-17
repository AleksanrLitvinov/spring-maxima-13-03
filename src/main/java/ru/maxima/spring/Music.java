package ru.maxima.spring;

import org.springframework.stereotype.Component;

@Component
public class Music {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
