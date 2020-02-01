package ir.mctab.project.entities;

import org.hibernate.annotations.SQLUpdate;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Date creationDate;

    @ManyToOne
    private Customer customer;

    public Ticket() {
    }

    public Ticket(Date creationdate){
        this.creationDate=creationdate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
