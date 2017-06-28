package com.gihub.gossie.magnanimouswriter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class PersistenceContext {

    private final MovieEntityRepsitory movieEntityRepsitory;

    public MovieEntityMapper movieEntityMapper() {
        return new MovieEntityMapper();
    }

    @Bean
    public MovieRepository movieRepository() {
        return new DefaultMovieRepository(movieEntityMapper(), movieEntityRepsitory);
    }
}
