package com.gihub.gossie.magnanimouswriter;

public class Movie {

    private final Long id;
    private final String name;
    private final Genre genre;

    Movie(Long id, String name, Genre genre) {
        this.id = id;
        this.name = name;
        this.genre = genre;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Genre getGenre() {
        return genre;
    }
}
