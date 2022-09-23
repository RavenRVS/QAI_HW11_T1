package ru.netology.qai.hw11.javaqamaven.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

public class AfficheManagerTest {

    AfficheRepository repo = Mockito.mock(AfficheRepository.class);
    AfficheManager mrepo = new AfficheManager(repo);
    AfficheManager mrepo2 = new AfficheManager(repo,2);


    MovieItem movie1 = new MovieItem(1, "Бладшот");
    MovieItem movie2 = new MovieItem(2, "Вперед");
    MovieItem movie3 = new MovieItem(3, "Джентельмены");

    @BeforeEach
    public void setup() {
        MovieItem[] movies = { movie1, movie2, movie3 };
        doReturn(movies).when(repo).findAll();
    }

    @Test
    public void add() {

        MovieItem[] expected = {movie1, movie2, movie3};
        MovieItem[] actual = mrepo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastNotDefault() {

        MovieItem[] expected = {movie3, movie2};
        MovieItem[] actual = mrepo2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastDefault() {

        MovieItem[] expected = {movie3, movie2, movie1};
        MovieItem[] actual = mrepo.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}