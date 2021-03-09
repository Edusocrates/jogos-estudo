package com.treinamento.fiapjogos.fiapjogos.Entity;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class GamesTest {

    @InjectMocks
    private Game gamess;

    @Test
     void testToString() {
        assertNotNull(gamess.toString());
    }

    @Test
    void testGettersAndSetters(){
        Game game = new Game();
        String stringMock ="teste";
        Integer intMock = 123;
        Date date = new Date(30/12/2000);

        game.setId(intMock);
        game.setCategory(Category.ACTION);
        game.setName(stringMock);
        game.setReleaseDate(date);
        List<Character> characterList = new ArrayList<>();
        Character character = new Character();
        character.setId(intMock);
        character.setName(stringMock);
        characterList.add(character);
        game.setCharacterList(characterList);
        game.setRating(stringMock);
        game.setImageUrl(stringMock);

        assertEquals(game.getId(),intMock);
        assertEquals(game.getName(),stringMock);
        assertEquals(game.getCategory(),Category.ACTION);
        assertEquals(game.getImageUrl(),stringMock);
        assertEquals(game.getCharacterList(),characterList);
        assertEquals(game.getRating(),stringMock);
        assertEquals(game.getReleaseDate(),date);



    }



}
