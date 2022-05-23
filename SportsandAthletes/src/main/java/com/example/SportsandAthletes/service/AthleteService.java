package com.example.SportsandAthletes.service;

import com.example.SportsandAthletes.repository.AthleteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
