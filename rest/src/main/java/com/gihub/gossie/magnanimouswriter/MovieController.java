package com.gihub.gossie.magnanimouswriter;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
@RequestMapping("/api/movies")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MovieController {

    private static final String MEDIA_TYPE = "application/vnd.magnanimouswriter.v3+json";

    private final MovieService movieService;
    private final MovieDTOMapper movieMapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTO>> getMovies() {
        return ResponseEntity.ok(movieService.determineAllMovies().stream().map(movieMapper::map).collect(Collectors.toList()));
    }

    @PostMapping(consumes = MEDIA_TYPE)
    @ResponseStatus(HttpStatus.OK)
    public void createMovie(MovieDTO movie) {
        movieService.createMovie(movieMapper.map(movie));
    }
}
