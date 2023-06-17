package ru.maxima.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Music {

    private String name;

    @Autowired
    public Music(@Value("Franz Ferdinant - Take ma out") String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
