package com.github.gossie.magnanimouswriter;

import java.util.stream.IntStream;

import org.junit.Test;

public class MovieTest {

	@Test
	public void testDetermineAverageRaiting() throws Exception {
		Movie movie = new Movie(1L, "Strib langsam", Genre.ACTION);
		IntStream.of(4, 3, 5, 5, 2, 5, 3).mapToObj(r -> new Rating(r)).forEach(movie::addRaiting);
		
		MovieAssert.assertThat(movie).hatAverageRating(3.9);
	}
}
