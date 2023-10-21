package br.com.musics.models;

public class Audio {
    private String title;
    private int totalStreams;
    private int totalLikes;
    private int classification;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalStreams() {
        return totalStreams;
    }

    private void setTotalStreams(int totalStreams) {
        this.totalStreams = totalStreams;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    private void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }

    public void like() {
     setTotalLikes(getTotalLikes() + 1);
    }
    public void play() {
        setTotalStreams(getTotalStreams() + 1);
    }

}
