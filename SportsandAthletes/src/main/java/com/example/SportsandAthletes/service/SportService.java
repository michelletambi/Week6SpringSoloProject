package com.example.SportsandAthletes.service;

import com.example.SportsandAthletes.repository.SportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SportService {
    @Autowired
    private SportRepository sportRepository;

    public SportService(){
    }

    public SportService(SportRepository sportRepository){
        this.sportRepository = sportRepository;
    }
//    getter and setter

    public SportRepository getSportRepository() {
        return sportRepository;
    }

    public void setSportRepository(SportRepository sportRepository) {
        this.sportRepository = sportRepository;
    }

    public void deleteSport(Long sportId){
        boolean exists = sportRepository.existsById(sportId);
        if (! exists) {
            throw new IllegalStateException("A sport with id " + sportId + " does not exist.");
        }
        sportRepository.deleteById(sportId);
    }
}
