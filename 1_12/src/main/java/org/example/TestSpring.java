package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
       /* Music music2 = context.getBean("classicalMusic", Music.class);
        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
        classicalMusicPlayer.playMusic();


        Music music = context.getBean("rockMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(music);*/
        /*ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());*/
        /*MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        boolean comparision = firstMusicPlayer==secondMusicPlayer;
        System.out.println(comparision);

        System.out.println(firstMusicPlayer);
        System.out.println(secondMusicPlayer);

        firstMusicPlayer.setVolume(10);
        System.out.println(firstMusicPlayer.getVolume());

        System.out.println(secondMusicPlayer.getVolume());*/
        //musicPlayer.playMusic();

        /*
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        */
 MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
 musicPlayer.playMusic(MusicGenre.CLASSICAL);
       musicPlayer.playMusic(MusicGenre.ROCK);
       // Computer computer = context.getBean("computer", Computer.class);
        //System.out.println(computer);
        context.close();
    }
}
