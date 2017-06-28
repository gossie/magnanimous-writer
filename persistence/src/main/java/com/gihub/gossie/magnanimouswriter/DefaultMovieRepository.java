package com.gihub.gossie.magnanimouswriter;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class DefaultMovieRepository implements MovieRepository {

    private final MovieEntityMapper movieMapper;
    private final MovieEntityRepsitory movieEntityRepsitory;

    @Override
    public List<Movie> determineAllMovies() {
        return movieEntityRepsitory.findAll().stream().map(movieMapper::map).collect(Collectors.toList());
    }

}
