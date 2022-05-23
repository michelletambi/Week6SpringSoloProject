package com.example.SportsandAthletes.service;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Objects;

@Service
public class AthleteService {

    @Autowired
    private AthleteRepository athleteRepository;

    public AthleteService(){

    }
    public AthleteService(AthleteRepository athleteRepository){
        this.athleteRepository = athleteRepository;
    }
//    getter and setter

    public AthleteRepository getAthleteRepository() {
        return athleteRepository;
    }

    public void setAthleteRepository(AthleteRepository athleteRepository) {
        this.athleteRepository = athleteRepository;
    }
//    methods/behaviours
    public void deleteAthlete(Long athleteId){
        boolean exists = athleteRepository.existsById(athleteId);
        if (! exists){
            throw new IllegalStateException("Athlete with id " + athleteId + " does not exist");
        }
        athleteRepository.deleteById(athleteId);
    }

    @Transactional
    public void updateCountry(Long athleteId, String country){
        boolean exists = athleteRepository.existsById(athleteId);
        Athlete athlete = athleteRepository.getById(athleteId);
        if (exists && ! Objects.equals(athlete.getCountry(), country)) {
            athlete.setCountry(country);
        } else {
            throw new IllegalStateException("Athlete with id " + athleteId + " does not exist.");
        }

    }
}
