package com.gihub.gossie.magnanimouswriter.v2;

import java.util.List;
import java.util.stream.Collectors;

import com.gihub.gossie.magnanimouswriter.Movie;
import com.gihub.gossie.magnanimouswriter.MovieService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Component
class V2ToV3MapperImpl implements V2ToV3Mapper {

    private final MovieService movieService;

    @Override
    public List<MovieDTOV2> determineAllMovies() {
        return movieService.determineAllMovies().stream().map(this::map).collect(Collectors.toList());
    }

    private MovieDTOV2 map(Movie movie) {
        MovieDTOV2 mappedMovie = new MovieDTOV2();
        mappedMovie.setName(movie.getName());
        mappedMovie.setGenre(String.valueOf(movie.getGenre()));
        return mappedMovie;
    }
}
