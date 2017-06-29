package com.gihub.gossie.magnanimouswriter;

class MovieEntityMapper {

    Movie map(MovieEntity movie) {
        return new Movie(movie.getId(), movie.getName(), Genre.valueOf(movie.getGenre()));
    }

    MovieEntity map(Movie movie) {
        return new MovieEntity(movie.getName(), String.valueOf(movie.getGenre()));
    }
}
