package com.example.SportsandAthletes.controller;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AthleteController {

    @Autowired
    private final AthleteRepository athleteRepository;
//    Constructor
    public AthleteController(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }

    @GetMapping("/athletes")
    public ResponseEntity<List<Athlete>> getAllAthlete(){
        List<Athlete> athletes = athleteRepository.findAll();
        return ResponseEntity
                .ok()
                .body(athletes);
    }

    @PostMapping("/athletes")
//    For this to work in Swagger, remove the string/type it is expecting for the foreign key: in this case, when
//    adding a new athlete, removing the string it is expecting in the athletes field: athlete []
    public ResponseEntity<Athlete> createAthlete(@RequestBody Athlete athlete){
        Athlete result = athleteRepository.save(athlete);
        return ResponseEntity
                .ok()
                .body(result);
    }

    @DeleteMapping(path = {"/athletes/{id}"})
    public void deleteAthlete(@PathVariable("id") Long athleteId) {
        athleteService.deleteAthlete(athleteId);
    }

}
