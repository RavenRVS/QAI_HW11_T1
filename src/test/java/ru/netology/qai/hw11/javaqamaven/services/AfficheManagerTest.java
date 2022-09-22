package ru.netology.qai.hw11.javaqamaven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfficheManagerTest {

    MovieItem movie1 = new MovieItem(1, "Бладшот");
    MovieItem movie2 = new MovieItem(2, "Вперед");
    MovieItem movie3 = new MovieItem(3, "Джентельмены");

    @Test
    public void add() {
        AfficheManager manager = new AfficheManager();
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        MovieItem[] expected = {movie1, movie2, movie3};
        MovieItem[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNotDefault() {
        AfficheManager manager = new AfficheManager(2);

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        MovieItem[] expected = {movie3, movie2};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefault() {
        AfficheManager manager = new AfficheManager();

        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);

        MovieItem[] expected = {movie3, movie2, movie1};
        MovieItem[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}