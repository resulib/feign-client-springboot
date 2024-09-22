package com.resul.feignclient.service;

import com.resul.feignclient.dto.MovieDto;
import com.resul.feignclient.yts.YtsMovie;
import com.resul.feignclient.yts.YtsResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MovieService {
    private final MovieServiceClient movieServiceClient;

    public List<MovieDto> findAll() {
        YtsResponse response = movieServiceClient.getMovies(10L);

        if (response != null && response.getData() != null) {
            return response.getData().getMovies().stream().map(this::toMovieDto).toList();
        }
        return List.of();
    }

    private MovieDto toMovieDto(YtsMovie movie) {
        MovieDto movieDto = new MovieDto();
        movieDto.setId(movie.getId());
        movieDto.setTitle(movie.getTitle());
        movieDto.setYear(movie.getYear());
        movieDto.setRating(movie.getRating());
        movieDto.setGenres(movie.getGenres());
        return movieDto;
    }

}
