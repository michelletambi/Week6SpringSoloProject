package com.example.SportsandAthletes.model;

import java.util.List;

public class Sport {
    private Long id;
    private String name;
    private String location;

    private List<Athlete> athletes;

//    no args constructor
    public Sport(){
    }

    public Sport(Long id, String name, String location, List<Athlete> athletes) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.athletes = athletes;
    }

//    getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }
}
