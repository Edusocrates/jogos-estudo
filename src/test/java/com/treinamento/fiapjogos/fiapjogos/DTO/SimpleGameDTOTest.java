package com.treinamento.fiapjogos.fiapjogos.DTO;


import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class SimpleGameDTOTest {

    @Mock
    private SimpleGameDTO simpleGameDTO;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Test
    void mustTestGetterAndSetters(){
        simpleGameDTO = jogosUtil.populateSimpleGameDTO();
        assertNotNull(simpleGameDTO);
        assertNotNull(simpleGameDTO.getId());
        assertNotNull(simpleGameDTO.getImageUrl());
        assertNotNull(simpleGameDTO.getName());



    }

    @Test
    void testingConstructor(){
        Game game = jogosUtil.populateGame();
        SimpleGameDTO simpleGameDTOs = new SimpleGameDTO(game);
        assertNotNull(simpleGameDTOs);
    }



}
