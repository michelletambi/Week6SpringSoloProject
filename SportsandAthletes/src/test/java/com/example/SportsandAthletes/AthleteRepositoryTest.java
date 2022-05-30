package com.example.SportsandAthletes;

import com.example.SportsandAthletes.model.Athlete;
import com.example.SportsandAthletes.repository.AthleteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class AthleteRepositoryTest {

    @Autowired
    private AthleteRepository athleteRepository;

    @Test
    void contextLoads(){
    }

    @Test
    public void canFindByCountry(){
//        given athleteRepository
//        when
        List<Athlete> found = athleteRepository.findByCountry("Sweden");
//        then
        assertEquals(found.size(), 2);
    }

    @Test
    public void canFindAllOfGender(){
//        given athleteRepository
//        when
        List<Athlete> found = athleteRepository.findAllOfGender("Female");
//        then
        assertEquals(found.size(), 11);

    }

}
