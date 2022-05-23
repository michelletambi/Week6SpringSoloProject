package com.example.SportsandAthletes.repository;

import com.example.SportsandAthletes.model.Athlete;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {

}
