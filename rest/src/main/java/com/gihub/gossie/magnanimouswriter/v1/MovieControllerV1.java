package com.gihub.gossie.magnanimouswriter.v1;

import java.util.List;
import java.util.stream.Collectors;

import com.gihub.gossie.magnanimouswriter.v2.MovieControllerV2;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/movies")
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class MovieControllerV1 {

    private static final String MEDIA_TYPE = "application/vnd.magnanimouswriter.v1+json";

    private final MovieControllerV2 movieControllerV2;
    private final V1ToV2Mapper mapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTOV1>> getMovies() {
        List<MovieDTOV1> mappedMovies = movieControllerV2.getMovies().getBody().stream().map(mapper::map).collect(Collectors.toList());
        return ResponseEntity.ok(mappedMovies);
    }
}
