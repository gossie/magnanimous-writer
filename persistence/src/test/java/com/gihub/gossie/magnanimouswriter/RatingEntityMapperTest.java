package com.gihub.gossie.magnanimouswriter;

import static com.gihub.gossie.magnanimouswriter.RatingAssert.assertThat;
import static com.gihub.gossie.magnanimouswriter.RatingEntityAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class RatingEntityMapperTest {
	
	private RatingEntityMapper ratingMapper;
	
	@Before
	public void setUp() {
		ratingMapper = new RatingEntityMapper();
	}

	@Test
	public void testMapRatingEntity() throws Exception {
		RatingEntity ratingEntity = new RatingEntity(4);
		Rating rating = ratingMapper.map(ratingEntity);
		assertThat(rating).hasNumberOfStars(4);
	}

	@Test
	public void testMapRating() throws Exception {
		Rating rating = new Rating(3);
		RatingEntity ratingEntity = ratingMapper.map(rating);
		assertThat(ratingEntity).hasNumberOfStars(3);
	}

}
