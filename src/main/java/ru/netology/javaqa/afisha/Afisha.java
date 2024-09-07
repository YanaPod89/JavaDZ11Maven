package ru.netology.javaqa.afisha;

public class Afisha {
    private String[] film = new String[0];
    private int limit = 5;

    public Afisha() {
    }

    public Afisha(int limit) {
        this.limit = limit;

    }

    public void addFilm(String newFilm) {
        String[] tmp = new String[film.length + 1];
        for (int i = 0; i < film.length; i++) {
            tmp[i] = film[i];
        }
        tmp[tmp.length - 1] = newFilm;
        film = tmp;
    }

    public String[] findAll() {
        return film;
    }

    public String[] findLast() {

        int resultLength;
        if (limit < film.length) {
            resultLength = limit;
        } else {
            resultLength = film.length;
        }

        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = film[film.length - 1 - i];
        }
        return tmp;

    }
}