package com.juanmarquesdev.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.juanmarquesdev.dslist.entities.Game;
import com.juanmarquesdev.dslist.projections.GameMinProjection;

/* Used to make interface between the application and database */
/* JpaRepository<"Entity that are mapped in database", "Type of id column of this entity"> */
public interface GameRepository extends JpaRepository<Game, Long> {
    @Query(nativeQuery = true, value = """
            SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
            tb_game.short_description AS shortDescription, tb_belonging.position
            FROM tb_game
            INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
            WHERE tb_belonging.list_id = :listId
            ORDER BY tb_belonging.position
            	""")
    List<GameMinProjection> searchByList(Long listId);
}
