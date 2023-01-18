package deepanshi.bookmyshow.Models;

import jakarta.persistence.*;
import lombok.*;
import org.apache.catalina.valves.rewrite.Substitution;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;


@NoArgsConstructor
@Entity
@Data//combination of @GETTER+@setter+@requiredargs+@tostring
@Table(name="User_table")
@Builder
@AllArgsConstructor
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String mobile;

    @CreationTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date createdDate;

    @UpdateTimestamp
    @Temporal(value = TemporalType.TIMESTAMP)
    private Date updatedDate;

    @OneToMany(mappedBy = "user" ,cascade=CascadeType.ALL)

    List<Tickets> ticketsList;


}
