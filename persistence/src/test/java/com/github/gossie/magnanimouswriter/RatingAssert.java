package com.github.gossie.magnanimouswriter;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class RatingAssert extends AbstractAssert<RatingAssert, Rating> {

	private RatingAssert(Rating actual) {
		super(actual, RatingAssert.class);
	}

	public static RatingAssert assertThat(Rating actual) {
		return new RatingAssert(actual);
	}
	
	public RatingAssert hasNumberOfStars(int numberOfStars) {
		Assertions.assertThat(actual.getNumberOfStars()).isEqualTo(numberOfStars);
		return this;
	}
}
