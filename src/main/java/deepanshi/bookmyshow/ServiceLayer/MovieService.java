package deepanshi.bookmyshow.ServiceLayer;

import deepanshi.bookmyshow.DTO.MovieRequestDto;
import deepanshi.bookmyshow.Models.Movie;
import deepanshi.bookmyshow.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
public String addMovie(MovieRequestDto movieRequestDto){

    Movie movie=Movie.builder().name(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();
    movieRepository.save(movie);
    return "Movie added succesfully";
}

public Movie findMovieByName(String name){
   return movieRepository.findMovieByName(name);
}

public List<Movie> findAllMovie(){

    List<Movie> movie=        movieRepository.findAll();
    return movie;
}

}
