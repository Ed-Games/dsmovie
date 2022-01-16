package com.edgames.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgames.dsmovie.entities.Score;
import com.edgames.dsmovie.entities.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk> {

}
