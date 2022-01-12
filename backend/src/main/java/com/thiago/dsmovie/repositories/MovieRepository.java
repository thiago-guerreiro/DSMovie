package com.thiago.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thiago.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
