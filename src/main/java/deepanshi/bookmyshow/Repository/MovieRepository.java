package deepanshi.bookmyshow.Repository;

import deepanshi.bookmyshow.Models.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

Movie findMovieByName(String name);
}
