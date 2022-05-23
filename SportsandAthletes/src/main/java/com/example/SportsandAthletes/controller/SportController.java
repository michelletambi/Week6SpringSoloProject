package com.example.SportsandAthletes.controller;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.model.Sport;
import com.example.SportsandAthletes.repository.AthleteRepository;
import com.example.SportsandAthletes.repository.SportRepository;
import com.example.SportsandAthletes.service.SportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SportController {

@Autowired
private final SportRepository sportRepository;
private SportService sportService;
    //    Constructor
    public SportController(SportRepository sportRepository, SportService sportService) {
        this.sportRepository = sportRepository;
        this.sportService = sportService;
    }

    @GetMapping("/sports")
    public ResponseEntity<List<Sport>> getAllSport(){
        List<Sport> sports = sportRepository.findAll();
        return ResponseEntity
                .ok()
                .body(sports);
    }
    @PostMapping("/sports")
    public ResponseEntity<Sport> createSport(@RequestBody Sport sport){
        Sport result = sportRepository.save(sport);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @DeleteMapping("/sports/{id}")
    public void deleteSport(@PathVariable("id") Long sportId){
        sportService.deleteSport(sportId);
    }



}
