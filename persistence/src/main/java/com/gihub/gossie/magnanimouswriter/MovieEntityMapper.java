package com.gihub.gossie.magnanimouswriter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access=AccessLevel.PACKAGE)
class MovieEntityMapper {
	
	private final RatingEntityMapper ratingMapper;

    Movie map(MovieEntity movie) {
        Movie mappedMovie = new Movie(movie.getId(), movie.getName(), Genre.valueOf(movie.getGenre()));
        movie.getRatings().stream().map(ratingMapper::map).forEach(mappedMovie::addRaiting);
		return mappedMovie;
    }

    MovieEntity map(Movie movie) {
        MovieEntity mappedMovie = new MovieEntity(movie.getName(), String.valueOf(movie.getGenre()));
        movie.getRatings().stream().map(ratingMapper::map).forEach(mappedMovie::addRating);
		return mappedMovie;
    }
}
