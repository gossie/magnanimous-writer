package com.github.gossie.magnanimouswriter.v1;

import com.github.gossie.magnanimouswriter.v2.MovieDTOV2;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Component
class V1ToV2Mapper {

    MovieDTOV1 map(MovieDTOV2 movie) {
        MovieDTOV1 mappedMovie = new MovieDTOV1();
        mappedMovie.setName(movie.getName());
        return mappedMovie;
    }

    public MovieDTOV2 map(MovieDTOV1 movie) {
        MovieDTOV2 mappedMovie = new MovieDTOV2();
        mappedMovie.setName(movie.getName());
        mappedMovie.setGenre("UNKNOWN");
        return mappedMovie;
    }
}
