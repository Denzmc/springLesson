package ru.zanuda.spring;

import org.springframework.stereotype.Component;

@Component
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "2PAC";
    }
}
