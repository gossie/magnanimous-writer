package com.github.gossie.magnanimouswriter;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class MovieAssert extends AbstractAssert<MovieAssert, Movie> {

	private MovieAssert(Movie actual) {
		super(actual, MovieAssert.class);
	}

	public static MovieAssert assertThat(Movie actual) {
		return new MovieAssert(actual);
	}

	public MovieAssert hatAverageRating(double averageRating) {
		Assertions.assertThat(actual.determineAverageRaiting()).isEqualTo(averageRating);
		return this;
	}
}
