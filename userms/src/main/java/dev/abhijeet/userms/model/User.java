package dev.abhijeet.userms.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.ws.rs.GET;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Test_User")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String address;


}
