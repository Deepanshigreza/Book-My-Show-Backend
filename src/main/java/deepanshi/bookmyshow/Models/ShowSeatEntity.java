package deepanshi.bookmyshow.Models;

import deepanshi.bookmyshow.enums.SeatTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="ShowSeats")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    int rate;
    private String seatNo;

@Enumerated(value =EnumType.STRING)
    private SeatTypes  seatTypes;

private boolean booked;
private Date bookedAt;

@ManyToOne
    @JoinColumn
    private Tickets tickets;

    @ManyToOne
    @JoinColumn
    private Shows show;

}
