package com.eugene.javacore.practic3.flyweight;


import java.util.ArrayList;
import java.util.List;

public class FestRunner {
    public static void main(String[] args) {
        MusicFactory musicFactory = new MusicFactory();
        List<MusicBand> musics = new ArrayList<>();
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("pop"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        musics.add(musicFactory.getMusicBandByTag("metal"));
        for(MusicBand m:musics){
            m.playMusic();
        }
    }
}
