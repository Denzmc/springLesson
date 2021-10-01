package ru.zanuda.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String > rock = new ArrayList<>(Arrays.asList("Him","Metallica","IronMaiden"));


    @Override
    public List<String > getSong() {
        return rock;
    }
}
