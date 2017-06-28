package com.gihub.gossie.magnanimouswriter.v1;

import java.util.List;
import java.util.stream.Collectors;

import com.gihub.gossie.magnanimouswriter.v2.MovieDTOV2;
import com.gihub.gossie.magnanimouswriter.v2.V2ToV3Mapper;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Component
class V1ToV2Mapper {

    private final V2ToV3Mapper mapper;

    List<MovieDTOV1> determineAllMovies() {
        return mapper.determineAllMovies().stream().map(this::map).collect(Collectors.toList());
    }

    private MovieDTOV1 map(MovieDTOV2 movie) {
        MovieDTOV1 mappedMovie = new MovieDTOV1();
        mappedMovie.setName(movie.getName());
        return mappedMovie;
    }
}
