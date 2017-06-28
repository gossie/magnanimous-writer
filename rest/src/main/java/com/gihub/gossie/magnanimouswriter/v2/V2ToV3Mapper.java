package com.gihub.gossie.magnanimouswriter.v2;

import com.gihub.gossie.magnanimouswriter.MovieDTO;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Component
class V2ToV3Mapper {

    MovieDTOV2 map(MovieDTO movie) {
        MovieDTOV2 mappedMovie = new MovieDTOV2();
        mappedMovie.setName(movie.getName());
        mappedMovie.setGenre(String.valueOf(movie.getGenre()));
        return mappedMovie;
    }
}
