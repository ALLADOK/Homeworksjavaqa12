package ru.netology.oop.Poster;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    private FilmManager manager = new FilmManager();
    private Film film1 = new Film();
    private Film film2 = new Film();
    private Film film3 = new Film();
    private Film film4 = new Film();
    private Film film5 = new Film();
    private Film film6 = new Film();
    private Film film7 = new Film();


    @Test
    public void test() {
        FilmManager manager = new FilmManager();


        Film[] expected = {};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test1() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);

        Film[] expected = {film1};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);


        Film[] expected = {film1, film2, film3};
        Film[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {
        FilmManager manager = new FilmManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void test4() {
        FilmManager manager = new FilmManager(7);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        Film[] expected = {film7, film6, film5, film4, film3, film2, film1};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {
        FilmManager manager = new FilmManager(3);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);

        Film[] expected = {film7, film6, film5};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {
        FilmManager manager = new FilmManager();


        Film[] expected = {};
        Film[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}