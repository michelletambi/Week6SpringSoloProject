package com.example.SportsandAthletes.controller;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.model.Sport;
import com.example.SportsandAthletes.repository.AthleteRepository;
import com.example.SportsandAthletes.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SportController {

@Autowired
private final SportRepository sportRepository;

    public SportController(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    @GetMapping("/sports")
    public ResponseEntity<List<Sport>> getAllSport(){
        List<Sport> sports = sportRepository.findAll();
        return ResponseEntity
                .ok()
                .body(sports);
    }



}
