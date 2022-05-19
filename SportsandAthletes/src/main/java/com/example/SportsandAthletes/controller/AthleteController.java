package com.example.SportsandAthletes.controller;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AthleteController {

    @Autowired
    AthleteRepository athleteRepository;

    @GetMapping("/athletes")
    public ResponseEntity<List<Athlete>> getAllAthlete(){
        List<Athlete> athletes = athleteRepository.findAll();
        athletes = athleteRepository.findAll();
        return ResponseEntity
                .ok()
                .body(athletes);
    }

}
