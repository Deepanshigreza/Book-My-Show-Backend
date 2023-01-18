package deepanshi.bookmyshow.Repository;

import deepanshi.bookmyshow.Models.TheatreSeat;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreSeatRepository extends JpaRepository<TheatreSeat, Integer> {

}
