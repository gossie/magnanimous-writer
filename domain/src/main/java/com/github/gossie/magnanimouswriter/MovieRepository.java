package com.github.gossie.magnanimouswriter;

import java.util.List;

public interface MovieRepository {

    List<Movie> determineAllMovies();

    void createMovie(Movie movie);

}
