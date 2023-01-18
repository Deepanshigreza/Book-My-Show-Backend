package deepanshi.bookmyshow.Controllers;

import deepanshi.bookmyshow.DTO.MovieRequestDto;
import deepanshi.bookmyshow.Models.Movie;
import deepanshi.bookmyshow.ServiceLayer.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @PostMapping("/addMovie")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto) {
        return movieService.addMovie(movieRequestDto);

    }
    @GetMapping("/findByName/{name}")
    public Movie findMovieByName(@PathVariable String name){

        return movieService.findMovieByName(name);
    }

    @GetMapping("/findAllMovies")
    public List<Movie> findAllMovie(){
        List<Movie> movie=movieService.findAllMovie();
        return movie;
    }
}
