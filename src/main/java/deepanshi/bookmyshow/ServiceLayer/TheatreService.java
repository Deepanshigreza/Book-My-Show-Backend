package deepanshi.bookmyshow.ServiceLayer;

import deepanshi.bookmyshow.DTO.TheatreRequestDto;
import deepanshi.bookmyshow.Models.Theatre;
import deepanshi.bookmyshow.Models.TheatreSeat;
import deepanshi.bookmyshow.Repository.TheatreRepository;
import deepanshi.bookmyshow.Repository.TheatreSeatRepository;
import deepanshi.bookmyshow.enums.SeatTypes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreRepository theatreRepository;
    @Autowired
    TheatreSeatRepository theatreSeatRepository;
    public String addTheatre(TheatreRequestDto theatreRequestDto){
        //convert dto to entity
        Theatre theatre=Theatre.builder().name(theatreRequestDto.getName()).city(theatreRequestDto.getCity()).address(theatreRequestDto.getAddress()).build();
        List<TheatreSeat> theatreSeats=createSeats();//function creates list of theater seats for to be set in theater seat list
        theatre.setTheaterSeatEntityList(theatreSeats);//created seats then set in theater set theatre seat list

        //once list is there we need to set theater id in theatre seats list
        //bidirectional relationship

        for(TheatreSeat seat:theatreSeats){
            seat.setTheatre(theatre);//jo theatre create kia uski seats automatically generate

        }
        theatreRepository.save(theatre);
return "added theatre successfully";
    }

    private List<TheatreSeat> createSeats() {//after creating list set each seat
        List<TheatreSeat> seats=new ArrayList<>();
        TheatreSeat theatreSeat1=new TheatreSeat("1A", SeatTypes.CLASSIC,100);
        TheatreSeat theatreSeat2=new TheatreSeat("1B", SeatTypes.CLASSIC,100);
        TheatreSeat theatreSeat3=new TheatreSeat("1C", SeatTypes.CLASSIC,100);
        TheatreSeat theatreSeat4=new TheatreSeat("1D", SeatTypes.CLASSIC,100);
        TheatreSeat theatreSeat5=new TheatreSeat("1E", SeatTypes.CLASSIC,100);
        TheatreSeat theatreSeat6=new TheatreSeat("2A", SeatTypes.PLATINUM,200);
        TheatreSeat theatreSeat7=new TheatreSeat("2B", SeatTypes.PLATINUM,200);
        TheatreSeat theatreSeat8=new TheatreSeat("2C", SeatTypes.PLATINUM,200);
        TheatreSeat theatreSeat9=new TheatreSeat("2D", SeatTypes.PLATINUM,200);
        TheatreSeat theatreSeat10=new TheatreSeat("2E", SeatTypes.PLATINUM,200);

        seats.add(theatreSeat1);
        seats.add(theatreSeat2);
        seats.add(theatreSeat3);
        seats.add(theatreSeat4);
        seats.add(theatreSeat5);
        seats.add(theatreSeat6);
        seats.add(theatreSeat7);
        seats.add(theatreSeat8);
        seats.add(theatreSeat9);
        seats.add(theatreSeat10);

        theatreSeatRepository.saveAll(seats);
return seats;
    }
}
