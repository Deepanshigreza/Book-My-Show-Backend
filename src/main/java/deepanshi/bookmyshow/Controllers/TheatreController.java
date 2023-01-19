package deepanshi.bookmyshow.Controllers;

import deepanshi.bookmyshow.DTO.TheatreRequestDto;
import deepanshi.bookmyshow.Models.Theatre;
import deepanshi.bookmyshow.ServiceLayer.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    public String addTheatre(@RequestBody TheatreRequestDto theatreRequestDto){

        return theatreService.addTheatre(theatreRequestDto);
    }

    @GetMapping("/findTheatreById/{id}")
    public Theatre findTheatreById(@PathVariable int id){

        return theatreService.findTheaterById(id);
    }

    @GetMapping("/findAllTheatre")
    public List<Theatre> findAll(){
        List<Theatre> theatres=theatreService.findAllTheatre();
        return theatres;

    }
}
