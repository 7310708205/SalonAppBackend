package com.example.salonbackend.Models;
import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "Appointment")

public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    private int id;

    @Column(name = "firstname", nullable = false)
    private String firstname;
    @Column(name = "lastname", nullable = false)
    private String lastname;

    @Column(name = "address", nullable = false)
    private String address;
    @Column(name = "service", nullable = false)
    private String service;
    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "date", nullable = false)
    private String date;


    public int getId() {
        return id;
    }

    public String getFirstname() { return firstname;}

    public String getLastname() { return lastname; }

    public String getService() {
        return service;
    }

    public String getCity() {
        return city;
    }

    public String getDate() {return date;}


    public void setId(int id) {
        this.id = id;
    }



    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setService(String service) { this.service = service; }

    public void setCity(String city) {
        this.city = city;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public Appointment(){
        
    }

    public void save(Appointment existingAppointment) {
    }
}
