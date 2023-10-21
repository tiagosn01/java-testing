package br.com.musics.models;

public class Favorite {

    public void add(Audio audio) {
        if(audio.getClassification() > 9) {
            System.out.println(audio.getTitle() + " its successful and thousands people are hearing!");
        } else {
            System.out.println(audio.getTitle() + " good classification");
        }
    }
}
