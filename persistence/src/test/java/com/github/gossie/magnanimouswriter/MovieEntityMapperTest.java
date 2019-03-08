package com.github.gossie.magnanimouswriter;

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

        MovieAssert.assertThat(movie).hasName("Stirb langsam").hasGenre(Genre.ACTION);
    }

}
