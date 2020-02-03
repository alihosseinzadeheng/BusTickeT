package ir.mctab.project.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ticket {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private Long tripId;

    @Column
    private String origin;

    @Column
    private String destination;

    @Column
    private int price;

    @Column
    private LocalDate creationDate;

    @ManyToOne
    private Customer customer;

    public Ticket() {
    }

    public Ticket(Long tripId, Customer customer ,String origin, String destination, int price, LocalDate creationDate){
        this.tripId=tripId;
        this.customer=customer;
        this.origin=origin;
        this.destination=destination;
        this.price=price;
        this.creationDate=creationDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", tripId=" + tripId +
                ", origin='" + origin + '\'' +
                ", destination='" + destination + '\'' +
                ", price=" + price +
                ", creationDate=" + creationDate +
                ", Customer information:" + customer +
                '}';
    }
}
