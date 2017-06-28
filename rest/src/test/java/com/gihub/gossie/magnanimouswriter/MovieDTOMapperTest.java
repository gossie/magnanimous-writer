package com.gihub.gossie.magnanimouswriter;

import static com.gihub.gossie.magnanimouswriter.MovieDTOAssert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class MovieDTOMapperTest {

    private MovieDTOMapper mapper;

    @Before
    public void setUp() {
        mapper = new MovieDTOMapper();
    }

    @Test
    public void testMap() throws Exception {
        Movie movie = new Movie(1L, "Geschenkt ist noch zu teuer", Genre.COMEDY);

        MovieDTO movieDTO = mapper.map(movie);

        assertThat(movieDTO).hasName("Geschenkt ist noch zu teuer").hasGenre("COMEDY");
    }

}
