package ru.zanuda.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

//@Component
public class ClassicalMusic implements Music{

    List<String> classic = new ArrayList<>();
    @Override
    public List<String> getSong() {
        return classic;
    }
}
