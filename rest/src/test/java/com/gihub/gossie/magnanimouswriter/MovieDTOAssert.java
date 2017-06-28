package com.gihub.gossie.magnanimouswriter;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class MovieDTOAssert extends AbstractAssert<MovieDTOAssert, MovieDTO> {

    private MovieDTOAssert(MovieDTO actual) {
        super(actual, MovieDTOAssert.class);
    }

    public static MovieDTOAssert assertThat(MovieDTO actual) {
        return new MovieDTOAssert(actual);
    }

    public MovieDTOAssert hasName(String name) {
        Assertions.assertThat(actual.getName()).isEqualTo(name);
        return this;
    }

    public MovieDTOAssert hasGenre(String genre) {
        Assertions.assertThat(actual.getGenre()).isEqualTo(genre);
        return this;
    }
}
