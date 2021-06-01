package com.anabibelforscher.cardview.model;

public class Post {

    private String name;
    private String subtitle;
    private String time;
    private int image; //Recebe valor inteiro do id da postagem

    public Post() {
    }

    public Post(String name, String subtitle, String time, int image) {
        this.name = name;
        this.subtitle = subtitle;
        this.time = time;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
