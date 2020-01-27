package ir.mctab.project.entities;

import javax.persistence.Entity;

@Entity
public class Customer {
    private Long id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;

}
