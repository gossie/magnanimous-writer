package com.gihub.gossie.magnanimouswriter;

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

    public double determineRaiting() {
        return ((double) ratings.stream().mapToInt(Rating::getNumberOfStars).reduce(0, (a, b) -> a + b)) / ratings.size();
    }

    public List<Rating> getRaitings() {
        return Collections.unmodifiableList(ratings);
    }
}
