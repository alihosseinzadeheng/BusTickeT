package ir.mctab.project.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;
    @Column
    private String username;
    @Column
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String gender;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Ticket> ticketList= new ArrayList<>();


    public Customer() {
    }

    public Customer(String username, String password, String firstname, String lastname, String gender){
        this.username=username;
        this.password=password;
        this.firstName=firstname;
        this.lastName=lastname;
        this.gender=gender;
    }

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
