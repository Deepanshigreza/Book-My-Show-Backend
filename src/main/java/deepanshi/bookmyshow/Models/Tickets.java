package deepanshi.bookmyshow.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Ticket_table")
public class Tickets {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String allocateSeats;
    private int amt;

    @CreationTimestamp// it tracks created databse timestamp of java.util
            //@Temporal is a JPA annotation which can be used to store in the database table on of the following column items:

//    DATE (java.sql.Date)
//    TIME (java.sql.Time)
//    TIMESTAMP (java.sql.Timestamp)
//    Generally when we declare a Date field in the class and try to store it.
//    It will store as TIMESTAMP in the database.
//
//    @Temporal
//    private Date joinedDate;
//    Above code will store value looks like 08-07-17 04:33:35.870000000 PM
//
//    If we want to store only the DATE in the database,
//    We can use/define TemporalType.

//    @Temporal(TemporalType.DATE)
//    private Date joinedDate;
//    This time, it would store 08-07-17 in database
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Shows show;//child

    @OneToMany(mappedBy = "tickets",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> bookedSeats;






}
