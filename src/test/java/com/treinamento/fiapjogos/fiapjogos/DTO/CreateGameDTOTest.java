package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;

@ExtendWith(MockitoExtension.class)
public class CreateGameDTOTest {

    @InjectMocks
    private CreateGameDTO createGameDTO;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Test
    void testGetterAndSetter(){
        createGameDTO = jogosUtil.populateCreateGameDTO();
        //JogosUtil jogo = mock(JogosUtil.class); exemplo de mock
        assertNotNull(createGameDTO);
        assertNotNull(createGameDTO.getCategory());
        assertNotNull(createGameDTO.getCharacterList());
        assertNotNull(createGameDTO.getReleaseDate());
        assertNotNull(createGameDTO.getRating());
        assertNotNull(createGameDTO.getName());
        assertNotNull(createGameDTO.getImageUrl());
    }



}
