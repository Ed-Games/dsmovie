package com.edgames.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgames.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
