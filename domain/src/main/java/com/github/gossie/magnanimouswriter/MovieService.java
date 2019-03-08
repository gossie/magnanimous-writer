package com.github.gossie.magnanimouswriter;

import java.util.List;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> determineAllMovies() {
        return movieRepository.determineAllMovies();
    }

    public void createMovie(Movie movie) {
        movieRepository.createMovie(movie);
    }

}
