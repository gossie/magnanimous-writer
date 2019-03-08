package com.github.gossie.magnanimouswriter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class PersistenceContext {

    private final MovieEntityRepsitory movieEntityRepsitory;

    public RatingEntityMapper ratingEntityMapper() {
        return new RatingEntityMapper();
    }
    
    public MovieEntityMapper movieEntityMapper() {
        return new MovieEntityMapper(ratingEntityMapper());
    }

    @Bean
    public MovieRepository movieRepository() {
        return new DefaultMovieRepository(movieEntityMapper(), movieEntityRepsitory);
    }
}
