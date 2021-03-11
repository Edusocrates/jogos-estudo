package com.treinamento.fiapjogos.fiapjogos.Service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.CreateCharacterDTO;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CharacterService {


    CharacterDTO createCharacter(Integer gameId,CreateCharacterDTO createCharacterDTO);

    void deleteCharacter(Integer gameId, Integer characterId);

    List<CharacterDTO> getAllCharacters(Integer characterId);

    CharacterDTO getCharacterById(Integer characterId);

    CharacterDTO updateCharacter(Integer characterId, CreateCharacterDTO createCharacterDTO);

    //  List<CharacterDTO> findCharacterById(Integer characterId);

//
//    CharacterDTO findCharacterById(Integer characterId);
}
