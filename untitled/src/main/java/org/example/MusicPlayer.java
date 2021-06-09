package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;
@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    private Music music2;

//    private ClassicalMusic classicalMusic;
//    private RockMusic rockMusic;
/*@Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }*/

    // private List<Music> musicList = new ArrayList<>();
    //@Value("${musicPlayer.name}")
    private String name;
    //@Value("${musicPlayer.value}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    //IoC
    //@Autowired
   /* public MusicPlayer(Music music){
        this.music = music;
    }*/

    public MusicPlayer(){}
/*
    public void setMusic(Music music) {
        this.music = music;
    }*/



   /* public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }*/

   public void playMusic(MusicGenre genre){
       Random random = new Random();
       int rand = random.nextInt(3);
       if(genre ==MusicGenre.CLASSICAL){
           System.out.println(classicalMusic.getSong().get(rand));
       }
       else
           System.out.println(rockMusic.getSong().get(rand));
       //return "PLAYING "+music1.getSong()+" "+music2.getSong();



    }


}
