package com.gihub.gossie.magnanimouswriter;

class MovieEntityMapper {

    Movie map(MovieEntity movie) {
        return new Movie(movie.getId(), movie.getName(), Genre.valueOf(movie.getGenre()));
    }
}
