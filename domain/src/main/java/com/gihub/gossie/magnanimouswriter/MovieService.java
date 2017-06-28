package com.gihub.gossie.magnanimouswriter;

import java.util.List;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository movieRepository;

    public List<Movie> determineAllMovies() {
        return movieRepository.determineAllMovies();
    }

}
