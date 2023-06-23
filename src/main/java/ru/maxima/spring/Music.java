package ru.maxima.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Music {

    private String name;

    public Music( String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
