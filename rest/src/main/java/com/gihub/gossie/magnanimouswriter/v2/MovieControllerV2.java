package com.gihub.gossie.magnanimouswriter.v2;

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
public class MovieControllerV2 {

    private static final String MEDIA_TYPE = "application/vnd.magnanimouswriter.v2+json";

    private final V2ToV3Mapper mapper;

    @GetMapping(produces = MEDIA_TYPE)
    public ResponseEntity<List<MovieDTOV2>> getMovies() {
        return ResponseEntity.ok(mapper.determineAllMovies());
    }
}
