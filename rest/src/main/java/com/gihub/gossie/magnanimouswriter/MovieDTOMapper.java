package com.gihub.gossie.magnanimouswriter;

class MovieDTOMapper {

    MovieDTO map(Movie movie) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setName(movie.getName());
        movieDTO.setGenre(String.valueOf(movie.getGenre()));
        return movieDTO;
    }
}
