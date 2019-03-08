package com.github.gossie.magnanimouswriter;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;

public class RatingEntityAssert extends AbstractAssert<RatingEntityAssert, RatingEntity> {

	private RatingEntityAssert(RatingEntity actual) {
		super(actual, RatingEntityAssert.class);
	}

	public static RatingEntityAssert assertThat(RatingEntity actual) {
		return new RatingEntityAssert(actual);
	}
	
	public RatingEntityAssert hasNumberOfStars(int numberOfStars) {
		Assertions.assertThat(actual.getNumberOfStars()).isEqualTo(numberOfStars);
		return this;
	}
}
