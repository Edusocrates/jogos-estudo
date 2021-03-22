package com.treinamento.fiapjogos.fiapjogos.Repository;


import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {

    @Query("SELECT e FROM Character e WHERE e.id =:characterId")
    Character findCharacterById(@Param("characterId") Integer characterId);

    @Query("SELECT e FROM Character e WHERE e.game =:gameId")
    List<Character> getCharactersGame(@Param("gameId") Integer gameId);

    @Query("SELECT e FROM Character e")
    List<Character> getAllCharacters();

}
