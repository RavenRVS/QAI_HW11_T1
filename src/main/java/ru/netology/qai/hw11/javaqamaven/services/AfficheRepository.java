package ru.netology.qai.hw11.javaqamaven.services;

public class AfficheRepository {
    private MovieItem[] movies = new MovieItem[0];

    public void save(MovieItem movie) {
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

    public MovieItem[] findById(int idMovie) {
        MovieItem[] findedMovie = new MovieItem[1];
        for (MovieItem movie : movies) {
            if (movie.getId() == idMovie) {
                findedMovie[0] = movie;
            }
        } return findedMovie;
    }

    public void removeById(int idMovie) {
        MovieItem[] tmp = new MovieItem[movies.length - 1];
        int copyToIndex = 0;
        for (MovieItem movie : movies) {
            if (movie.getId() != idMovie) {
                tmp[copyToIndex] = movie;
                copyToIndex++;
            }
        }
        movies = tmp;
    }

    public void removeAll() {
        MovieItem[] tmp = new MovieItem[0];
        movies = tmp;
    }
}
