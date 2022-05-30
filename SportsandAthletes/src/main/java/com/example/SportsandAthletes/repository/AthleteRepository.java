package com.example.SportsandAthletes.repository;

import com.example.SportsandAthletes.model.Athlete;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface AthleteRepository extends JpaRepository<Athlete, Long> {


    @Query(value = "SELECT * FROM athlete WHERE country = ?1", nativeQuery = true)
    List<Athlete> findByCountry(String country);

    @Query(value = "SELECT * FROM athlete WHERE gender = ?1", nativeQuery = true)
    List<Athlete> findAllOfGender(String gender);
}
