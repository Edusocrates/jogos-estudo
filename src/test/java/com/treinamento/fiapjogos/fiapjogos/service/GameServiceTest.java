package com.treinamento.fiapjogos.fiapjogos.service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Service.GameService;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {

    @InjectMocks
    private GameService gameService;//pesquisar se chama a implementation ou a interface


    void createGameTest(){
        CreateGameDTO createGameDTO = new CreateGameDTO();
        String stringMock = "teste";
        createGameDTO.setCategory(Category.ACTION);
        createGameDTO.setImageUrl(stringMock);
        createGameDTO.setName(stringMock);
        createGameDTO.setReleaseDate(new Date());
        createGameDTO.setRating(stringMock);
        List<Character> characterList = new ArrayList<>();
        Character character = new Character();
        character.setId(123);
        character.setName(stringMock);
        characterList.add(character);
        createGameDTO.setCharacterList(characterList);

    }


}
