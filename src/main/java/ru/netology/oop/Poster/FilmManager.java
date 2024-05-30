package ru.netology.oop.Poster;

public class FilmManager {

    private Film[] films = new Film[0];
    private int limit;


    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        int rezultlength;
        if (films.length < limit) {
            rezultlength = films.length;
        } else {
            rezultlength = limit;
        }
        Film[] tmp = new Film[rezultlength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}