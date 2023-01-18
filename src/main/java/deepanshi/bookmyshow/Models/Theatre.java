package deepanshi.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name="theatre")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Theatre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String address;

    //list of shows

    @OneToMany(mappedBy = "theatre",cascade =CascadeType.ALL)
    List<Shows> listOfShow;
    @OneToMany(mappedBy = "theatre", cascade = CascadeType.ALL)
    List<TheatreSeat> theaterSeatEntityList;
}
