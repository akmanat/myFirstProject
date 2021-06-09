package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component

public class RockMusic implements Music{
private List<String> song = new ArrayList<>();
    {
        song.add("RockMusic1");
        song.add("RockMusic2");
        song.add("RockMusic3");
    }
    @Override
    public List<String> getSong() {
        return song;
    }
}
