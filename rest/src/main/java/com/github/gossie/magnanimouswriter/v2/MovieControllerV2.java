package com.github.gossie.magnanimouswriter.v2;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.github.gossie.magnanimouswriter.MovieController;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/api/movies")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MovieControllerV2 {

    private static final String MEDIA_TYPE = "application/vnd.magnanimouswriter.v2+json";

    private final MovieController movieController;
    private final V2ToV3Mapper mapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTOV2>> getMovies() {
        List<MovieDTOV2> mappedMovies = movieController.getMovies().getBody().stream().map(mapper::map).collect(Collectors.toList());
        return ResponseEntity.ok(mappedMovies);
    }

    @PostMapping(consumes = MEDIA_TYPE)
    @ResponseStatus(HttpStatus.OK)
    public void createMovie(@RequestBody MovieDTOV2 movie) {
        movieController.createMovie(mapper.map(movie));
    }
}
