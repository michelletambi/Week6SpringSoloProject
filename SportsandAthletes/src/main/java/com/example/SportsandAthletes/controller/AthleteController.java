package com.example.SportsandAthletes.controller;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.repository.AthleteRepository;
import com.example.SportsandAthletes.service.AthleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AthleteController {

    @Autowired
    private final AthleteRepository athleteRepository;
    private AthleteService athleteService;
//    Constructor
    public AthleteController(AthleteRepository athleteRepository, AthleteService athleteService) {
        this.athleteRepository = athleteRepository;
        this.athleteService = athleteService;
    }


    @GetMapping("/athletes")
    public ResponseEntity<List<Athlete>> getAllAthlete(){
        List<Athlete> athletes = athleteRepository.findAll();
        return ResponseEntity
                .ok()
                .body(athletes);
    }

    @GetMapping("/athletes/{id}")
//    Get the athlete by the id
//    You must use <Optional> otherwise results in a server error in Swagger.
//    I think this is because it gives us the option to return nothing if the id does not exist.
    public ResponseEntity<Optional<Athlete>> getAthleteById(@PathVariable Long id){
        return new ResponseEntity<>(athleteRepository.findById(id), HttpStatus.OK);
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

    @PutMapping(path = {"/athletes/{id}"})
//    this allows us to change the athlete's country
    public void updateAthleteCountry(
            @PathVariable("id") Long athleteId,
            @RequestParam(required = false) String country) {
        athleteService.updateCountry(athleteId, country);
    }
}
