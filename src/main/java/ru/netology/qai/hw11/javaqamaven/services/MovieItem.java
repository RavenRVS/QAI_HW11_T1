package ru.netology.qai.hw11.javaqamaven.services;

public class MovieItem {
    private int id;
    private String movieName;

    public MovieItem(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }
}
