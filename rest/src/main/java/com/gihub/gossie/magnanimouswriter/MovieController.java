package com.gihub.gossie.magnanimouswriter;

import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/movies")
@RequiredArgsConstructor
public class MovieController {

    private static final String MEDIA_TYPE = "application/vnd.household.v1+json";

    private final MovieService movieService;
    private final MovieDTOMapper movieMapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTO>> getMovies() {
        return ResponseEntity.ok(movieService.determineAllMovies().stream().map(movieMapper::map).collect(Collectors.toList()));
    }
}
