package com.example.SportsandAthletes.repository;

import com.example.SportsandAthletes.model.Sport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SportRepository extends JpaRepository<Sport, Long> {
}
