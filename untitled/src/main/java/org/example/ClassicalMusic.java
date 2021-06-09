package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic() {    }
    private List<String> song = new ArrayList<>();
    //private String son [] = new String[];

    {
        song.add("ClassicalMusic 1");
        song.add("ClassicalMusic 2");
        song.add("ClassicalMusic 3");
    }
    /*public static ClassicalMusic getClassicalMusic(){
        return new ClassicalMusic();
    }*/

    public void doMyInit(){
        System.out.println("Here the process of initializating, cause Init function is working");
    }

    public void doMyDestroy(){
        System.out.println("Here destroy funtion is worked");
    }

    @Override
    public List<String> getSong() {
        return song;
    }

}
