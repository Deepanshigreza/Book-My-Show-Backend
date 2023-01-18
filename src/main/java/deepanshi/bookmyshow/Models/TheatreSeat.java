package deepanshi.bookmyshow.Models;

import deepanshi.bookmyshow.enums.SeatTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity//physical seats showed before booking by user
@Table(name="TheatreSeats")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TheatreSeat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    @Enumerated(value =EnumType.STRING)
    private SeatTypes seatType;//enum class
    private int rate;

    @ManyToOne
    @JoinColumn
    private Theatre theatre;

    public TheatreSeat(String seatNo, SeatTypes seatType, int rate) {
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.rate = rate;
    }
}
