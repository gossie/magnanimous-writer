package com.github.gossie.magnanimouswriter;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class RestContext {

    @Bean
    public MovieDTOMapper movieDTOMapper() {
        return new MovieDTOMapper();
    }
}
