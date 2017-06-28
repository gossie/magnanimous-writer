package com.gihub.gossie.magnanimouswriter.v1;

import java.util.List;

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

    private final V1ToV2Mapper mapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTOV1>> getMovies() {
        return ResponseEntity.ok(mapper.determineAllMovies());
    }
}
