package com.treinamento.fiapjogos.fiapjogos.Entity;

import com.treinamento.fiapjogos.fiapjogos.DTO.CharacterDTO;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CharacterTest {

    @InjectMocks
    private Character characters;

      @Test
      void testToString() {
        assertNotNull(characters.toString());
      }

      @Test
      void testGettersAndSetters(){
          Character character = new Character();
          String stringMock = "teste";
          Integer intMock = 123;

          character.setName(stringMock);
          character.setId(intMock);
          character.setImageUrl(stringMock);

          Game game = new Game();
          game.setId(intMock);
          game.setName(stringMock);
          character.setGame(game);

          assertEquals(character.getId(),intMock);
          assertEquals(character.getName(),stringMock);
          assertEquals(character.getImageUrl(),stringMock);
          assertEquals(character.getGame(),game);
      }

      @Test
      void toFullDTOTest(){
          Character character = new Character();
          String stringMock = "teste";
          Integer intMock = 123;

          character.setName(stringMock);
          character.setId(intMock);
          character.setImageUrl(stringMock);

          Game game = new Game();
          game.setId(intMock);
          game.setName(stringMock);
          character.setGame(game);
          assertNotNull(characters.toFullDTO(character));
      }

      @Test
    void fromDTOTest(){
          CharacterDTO characterDTO = new CharacterDTO();
          String stringMock = "teste";
          Integer intMock = 123;

          characterDTO.setName(stringMock);
          characterDTO.setId(intMock);
          characterDTO.setImageUrl(stringMock);

          Game game = new Game();
          game.setId(intMock);
          game.setName(stringMock);

          characterDTO.setGame(game);

          assertNotNull(characters.fromDTO(characterDTO));
      }


}
