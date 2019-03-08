package com.github.gossie.magnanimouswriter;

import static com.github.gossie.magnanimouswriter.MovieAssert.assertThat;

import java.util.stream.IntStream;

import org.junit.Test;

public class MovieTest {

	@Test
	public void testDetermineAverageRaiting() throws Exception {
		Movie movie = new Movie(1L, "Strib langsam", Genre.ACTION);
		IntStream.of(4, 3, 5, 5, 2, 5, 3).mapToObj(Rating::new).forEach(movie::addRaiting);
		
		assertThat(movie).hatAverageRating(3.9);
	}
}
