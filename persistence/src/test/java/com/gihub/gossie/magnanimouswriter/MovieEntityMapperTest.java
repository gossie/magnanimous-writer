package com.gihub.gossie.magnanimouswriter;

import static com.gihub.gossie.magnanimouswriter.MovieAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MovieEntityMapperTest {

    private MovieEntityMapper movieMapper;

    @Before
    public void setUp() {
        movieMapper = new MovieEntityMapper(new RatingEntityMapper());
    }

    @Test
    public void testMap() throws Exception {
        MovieEntity movieEntity = new MovieEntity("Stirb langsam", "ACTION");

        Movie movie = movieMapper.map(movieEntity);

        assertThat(movie).hasName("Stirb langsam").hasGenre(Genre.ACTION);
    }

}
