package br.com.musics.principal;

import br.com.musics.models.Favorite;
import br.com.musics.models.Music;
import br.com.musics.models.Podcast;

public class Principal {
    public static void main(String[] args) {
        Music music = new Music();
        music.setTitle("Yesterday");
        music.setArtist("Beatles");

        for (int i = 0; i < 2000; i++) {
            music.play();
        }

        for (int i = 0; i < 500; i++) {
            music.like();
        }

        Podcast podcast = new Podcast();

        podcast.setTitle("Flow");
        podcast.setDescription("Flow Podcast");

        for (int i = 0; i < 50; i++) {
            podcast.play();
        }

        for (int i = 0; i < 10; i++) {
            podcast.like();
        }

        Favorite favorite = new Favorite();

        System.out.println(music.getTotalLikes());
        favorite.add(music);
        favorite.add(podcast);

    }
}
