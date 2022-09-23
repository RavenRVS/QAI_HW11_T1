package ru.netology.qai.hw11.javaqamaven.services;

public class AfficheManager {

    private AfficheRepository repo;
    private int countLastMovies = 10;

    public AfficheManager(){}
    public AfficheManager(AfficheRepository repo) {
        this.repo = repo;
    }

    public AfficheManager(AfficheRepository repo, int LastMovies) {
        this.countLastMovies = LastMovies;
        this.repo = repo;
    }

    public void add(MovieItem movie) {
        repo.save(movie);
    }

    public MovieItem[] findAll() {
        MovieItem[] all = repo.findAll();
        return all;
    }

    public MovieItem[] findLast() {
        MovieItem[] movies = repo.findAll();
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
