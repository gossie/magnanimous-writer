package com.gihub.gossie.magnanimouswriter;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DefaultMovieRepository implements MovieRepository {

    private final MovieEntityMapper movieMapper;
    private final MovieEntityRepsitory movieEntityRepsitory;

    @Override
    public List<Movie> determineAllMovies() {
        return movieEntityRepsitory.findAll().stream().map(movieMapper::map).collect(Collectors.toList());
    }

    @Override
    public void createMovie(Movie movie) {
        movieEntityRepsitory.save(movieMapper.map(movie));
    }

}
