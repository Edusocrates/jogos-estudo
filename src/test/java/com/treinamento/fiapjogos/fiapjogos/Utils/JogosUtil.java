package com.treinamento.fiapjogos.fiapjogos.Utils;

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



}
