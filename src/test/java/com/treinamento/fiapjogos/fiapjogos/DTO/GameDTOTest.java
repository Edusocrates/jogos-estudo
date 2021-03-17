package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class GameDTOTest {

    @InjectMocks
    private JogosUtil jogosUtil;



    @Test
    void teste(){
        GameDTO gameDTO = jogosUtil.populateGameDTO();
        assertNotNull(gameDTO.getId());
        assertNotNull(gameDTO.getCategory());
        assertNotNull(gameDTO.getReleaseDate());
        assertNotNull(gameDTO.getRating());
        assertNotNull(gameDTO.getName());
        assertNotNull(gameDTO.getImageUrl());
        assertNotNull(gameDTO.getCharacterList());
    }

    @Test
    void constructorTest(){
        Game game = new Game();
        game = jogosUtil.populateGame();
        GameDTO gamedto = new GameDTO(game);
        assertNotNull(gamedto);
    }


}
