package br.com.musics.models;

public class Podcast extends Audio {
    private String host;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;

    @Override
    public int getClassification() {
        if(this.getTotalLikes() > 500) {
            return 10;
        } else {
            return 8;
        }
    }
}
