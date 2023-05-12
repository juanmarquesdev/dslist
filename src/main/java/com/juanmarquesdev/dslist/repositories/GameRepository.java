package com.juanmarquesdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.juanmarquesdev.dslist.entities.Game;

/* Used to make interface between the application and database */
/* JpaRepository<"Entity that are mapped in database", "Type of id column of this entity"> */
public interface GameRepository extends JpaRepository<Game, Long> {
    
}
