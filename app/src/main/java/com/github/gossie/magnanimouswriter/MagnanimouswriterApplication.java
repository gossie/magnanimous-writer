package com.github.gossie.magnanimouswriter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({ PersistenceContext.class, RestContext.class })
public class MagnanimouswriterApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagnanimouswriterApplication.class, args);
    }

    @Bean
    public MovieService movieService(MovieRepository movieRepository) {
        return new MovieService(movieRepository);
    }

    @Bean
    public CommandLineRunner initializeData(MovieEntityRepsitory movieEntityRepsitory) {
        return args -> {
            MovieEntity movie1 = new MovieEntity("Stirb langsam", "ACTION");
            movie1.addRating(new RatingEntity(4));
            movie1.addRating(new RatingEntity(5));
            
            MovieEntity movie2 = new MovieEntity("Geschenkt ist noch zu teuer", "COMEDY");
            movie2.addRating(new RatingEntity(3));
            movie2.addRating(new RatingEntity(4));
            movie2.addRating(new RatingEntity(4));
            
            MovieEntity movie3 = new MovieEntity("Bad Boys", "ACTION");
            movie3.addRating(new RatingEntity(4));
            
			movieEntityRepsitory.save(movie1);
			movieEntityRepsitory.save(movie2);
			movieEntityRepsitory.save(movie3);
        };
    }
}
