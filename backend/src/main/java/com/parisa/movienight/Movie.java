package com.parisa.movienight;

public class Movie {
    private String title;
    private int year;
    private String genre;

    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }
}
