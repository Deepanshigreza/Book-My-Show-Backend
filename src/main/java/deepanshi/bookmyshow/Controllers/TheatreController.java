package deepanshi.bookmyshow.Controllers;

import deepanshi.bookmyshow.DTO.TheatreRequestDto;
import deepanshi.bookmyshow.ServiceLayer.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/addTheatre")
    public String addTheatre(@RequestBody TheatreRequestDto theatreRequestDto){

        return theatreService.addTheatre(theatreRequestDto);
    }
}
