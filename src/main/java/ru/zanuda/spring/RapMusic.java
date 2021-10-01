package ru.zanuda.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RapMusic implements Music{

    private List<String > rap = new ArrayList<>();

    {
        rap.add("65cent");
        rap.add("25cent");
        rap.add("50cent");
    }


    @Override
    public List<String> getSong() {
        return rap;
    }
}
