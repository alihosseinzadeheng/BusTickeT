package ir.mctab.project.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TripList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String origin;
    @Column
    private String destination;
    @Column
    private Date date;
}
