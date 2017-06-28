package com.gihub.gossie.magnanimouswriter;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class RestContext {

    @Bean
    public MovieDTOMapper movieDTOMapper() {
        return new MovieDTOMapper();
    }
}
