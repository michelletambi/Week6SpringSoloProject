package com.example.SportsandAthletes.model;

import javax.persistence.*;

@Entity
public class Athlete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    @ManyToOne
//    athlete has a foreign key to Sport
    private Sport sportId;

//    no args constructor
    public Athlete() {
    }

    public Athlete(Long id, String firstName, String lastName, String gender, String country, Sport sportId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.country = country;
        this.sportId = sportId;
    }

//    getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Sport getSport() {
        return sportId;
    }

    public void setSport(Sport sport) {
        this.sportId = sport;
    }
}
