package com.treinamento.fiapjogos.fiapjogos.Repository;

import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game, Integer> {

    @Query("SELECT e FROM Game e WHERE e.id =:gameId ")
    Game findGame(@Param("gameId") Integer gameId);

    @Query("SELECT e FROM Game e WHERE e.releaseDate IS NOT NULL")
    List<Game> getAllActiveGames();

    @Query("SELECT e FROM Game e WHERE e.name LIKE '%:name%'")
    List<Game> findGameByName(@Param("name")String name);




}
