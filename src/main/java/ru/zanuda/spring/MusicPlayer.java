package ru.zanuda.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private Music music1;
    private Music music2;

//    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1,
                       @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(){

        return "Playing: " + music1.getSong() + ", " + music2.getSong();
    }

}
