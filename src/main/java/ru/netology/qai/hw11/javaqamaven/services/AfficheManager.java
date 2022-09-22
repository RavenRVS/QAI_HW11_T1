package ru.netology.qai.hw11.javaqamaven.services;

public class AfficheManager {

    private int countLastMovies = 10;

    public AfficheManager(){}
    public AfficheManager(int LastMovies) {
        countLastMovies = LastMovies;
    }
    private MovieItem[] movies = new MovieItem[0];

    public void add(MovieItem movie) {
        MovieItem[] tmp = new MovieItem[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public MovieItem[] findAll() {
        return movies;
    }

    public MovieItem[] findLast() {
        int resultLength;
        if (countLastMovies < movies.length) {
            resultLength = countLastMovies;
        } else {
            resultLength = movies.length;
        }
        MovieItem[] result = new MovieItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        } return result;
    }
}
