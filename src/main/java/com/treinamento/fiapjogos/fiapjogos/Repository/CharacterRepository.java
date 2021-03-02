package com.treinamento.fiapjogos.fiapjogos.Repository;


import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
}
