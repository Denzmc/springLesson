package ru.zanuda.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {

    private RapMusic rapMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(RapMusic music1,
                       RockMusic music2) {
        rapMusic = music1;
        rockMusic = music2;
    }


    public void playMusic(GENRES genres){
        Random random = new Random();
        int randomNun = random.nextInt(3);

        if (genres == GENRES.RAP){
            System.out.println(rapMusic.getSong().get(randomNun));
        } else {
            System.out.println(rockMusic.getSong().get(randomNun));
        }

    }

}
