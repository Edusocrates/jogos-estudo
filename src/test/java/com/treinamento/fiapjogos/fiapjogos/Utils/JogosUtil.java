package com.treinamento.fiapjogos.fiapjogos.Utils;

import com.treinamento.fiapjogos.fiapjogos.DTO.*;
import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class JogosUtil {

    public Game populateGame(){
        Game game = new Game();
        String stringMock = "teste";
        Integer intMock = 123;
        List<Character> characterList = new ArrayList<>();
        Character character = new Character();
        game.setName(stringMock);
        game.setId(intMock);
        game.setCategory(Category.ACTION);
        game.setReleaseDate(new Date());
        game.setRating(stringMock);
        game.setImageUrl(stringMock);
        character.setId(intMock);
        character.setName(stringMock);
        character.setImageUrl(stringMock);
        character.setGame(game);
        characterList.add(character);
        game.setCharacterList(characterList);
        return game;
    }

    public Character populateCharacter(){
        Character character = new Character();
        Game game = new Game();
        String stringMock = "teste";
        Integer intMock = 123;
        game.setName(stringMock);
        game.setId(intMock);
        game.setCategory(Category.ACTION);
        game.setReleaseDate(new Date());
        game.setRating(stringMock);
        game.setImageUrl(stringMock);
        character.setId(intMock);
        character.setName(stringMock);
        character.setImageUrl(stringMock);
        character.setGame(game);
        return character;
    }

    public CharacterDTO populateCharacterDTO(){
        CharacterDTO characterDTO = new CharacterDTO();
        Game game = new Game();
        String stringMock = "teste";
        Integer intMock = 123;
        game.setName(stringMock);
        game.setId(intMock);
        game.setCategory(Category.ACTION);
        game.setReleaseDate(new Date());
        game.setRating(stringMock);
        game.setImageUrl(stringMock);
        characterDTO.setId(intMock);
        characterDTO.setName(stringMock);
        characterDTO.setImageUrl(stringMock);
        characterDTO.setGame(game);
        return characterDTO;
    }
    public GameDTO populateGameDTO(){
        GameDTO gameDTO = new GameDTO();
        String stringMock = "teste";
        Integer intMock = 123;
        List<Character> characterList = new ArrayList<>();
        Character character = new Character();
        gameDTO.setName(stringMock);
        gameDTO.setId(intMock);
        gameDTO.setCategory(Category.ACTION);
        gameDTO.setReleaseDate(new Date());
        gameDTO.setRating(stringMock);
        gameDTO.setImageUrl(stringMock);
        character.setId(intMock);
        character.setName(stringMock);
        character.setImageUrl(stringMock);
      //  character.setGame(gameDTO);
        characterList.add(character);
        gameDTO.setCharacterList(null);//verificar construtor no projeto original
        return gameDTO;
    }
    public CreateCharacterDTO populateCreateCharacterDTO(){
        CreateCharacterDTO createCharacterDTO = new CreateCharacterDTO();
        Game game = new Game();
        String stringMock = "teste";
        Integer intMock = 123;
        game.setName(stringMock);
        game.setId(intMock);
        game.setCategory(Category.ACTION);
        game.setReleaseDate(new Date());
        game.setRating(stringMock);
        game.setImageUrl(stringMock);
        createCharacterDTO.setName(stringMock);
        createCharacterDTO.setImageUrl(stringMock);
        createCharacterDTO.setGame(game);
        return createCharacterDTO;
    }
    public CreateGameDTO populateCreateGameDTO(){
        CreateGameDTO createGameDTO = new CreateGameDTO();
        String stringMock = "teste";
        Integer intMock = 123;
        List<Character> characterList = new ArrayList<>();
        Character character = new Character();
        createGameDTO.setName(stringMock);
        createGameDTO.setCategory(Category.ACTION);
        createGameDTO.setReleaseDate(new Date());
        createGameDTO.setRating(stringMock);
        createGameDTO.setImageUrl(stringMock);
        character.setId(intMock);
        character.setName(stringMock);
        character.setImageUrl(stringMock);
       // character.setGame(crea);
        characterList.add(character);
        createGameDTO.setCharacterList(characterList);
        return createGameDTO;
    }

    public SimpleGameDTO populateSimpleGameDTO(){
        SimpleGameDTO simpleGameDTO = new SimpleGameDTO();
        String stringMock = "teste";
        Integer intMock = 123;
        simpleGameDTO.setId(intMock);
        simpleGameDTO.setName(stringMock);
        simpleGameDTO.setImageUrl(stringMock);
        return simpleGameDTO;
    }


}
