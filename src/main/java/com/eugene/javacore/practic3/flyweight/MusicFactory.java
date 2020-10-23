package com.eugene.javacore.practic3.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MusicFactory {
    private static final Map<String, MusicBand> bandMap = new HashMap<>();


    public MusicBand getMusicBandByTag(String tag) {
        MusicBand musicBand = bandMap.get(tag);
        if (musicBand == null) {
            switch (tag) {
                case "pop":
                    System.out.println("Pop group invited...");
                    musicBand = new PopBand();
                    break;

                case "metal":
                    System.out.println("Metal group invited...");
                    musicBand = new MetalBand();

            }
            bandMap.put(tag, musicBand);

        }
        return musicBand;
    }
}
