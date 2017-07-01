package com.gihub.gossie.magnanimouswriter;

class MovieDTOMapper {

    MovieDTO map(Movie movie) {
        MovieDTO movieDTO = new MovieDTO();
        movieDTO.setName(movie.getName());
        movieDTO.setGenre(String.valueOf(movie.getGenre()));
        movieDTO.setAverageRating(movie.determineAverageRaiting());
        return movieDTO;
    }

    public Movie map(MovieDTO movie) {
        return new Movie(null, movie.getName(), Genre.valueOf(movie.getGenre()));
    }
}
