package com.gihub.gossie.magnanimouswriter;

class RatingEntityMapper {

	Rating map(RatingEntity rating) {
		return new Rating(rating.getNumberOfStars());
	}
	
	RatingEntity map(Rating rating) {
		return new RatingEntity(rating.getNumberOfStars());
	}
}
