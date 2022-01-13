package com.thiago.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.dsmovie.entities.Score;
import com.thiago.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
