package com.github.gossie.magnanimouswriter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
@Getter
public class Movie {

    private final Long id;
    private final String name;
    private final Genre genre;
    private final List<Rating> ratings = new ArrayList<>();

    public double determineAverageRaiting() {
        double sum = ratings.stream()
        		.mapToInt(Rating::getNumberOfStars)
        		.reduce(0, (a, b) -> a + b);
		return Math.round((sum / ratings.size()) * 10.0) / 10.0;
    }
    
    public void addRaiting(Rating rating) {
    	ratings.add(rating);
    }

    public List<Rating> getRaitings() {
        return Collections.unmodifiableList(ratings);
    }
}
