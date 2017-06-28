package com.gihub.gossie.magnanimouswriter;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class MovieAssert extends AbstractAssert<MovieAssert, Movie> {

    private MovieAssert(Movie actual) {
        super(actual, MovieAssert.class);
    }

    public static MovieAssert assertThat(Movie actual) {
        return new MovieAssert(actual);
    }

    public MovieAssert hasName(String name) {
        Assertions.assertThat(actual.getName()).isEqualTo(name);
        return this;
    }

    public MovieAssert hasGenre(Genre genre) {
        Assertions.assertThat(actual.getGenre()).isEqualTo(genre);
        return this;
    }
}
