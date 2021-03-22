package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CreateCharacterDTOTest {

    @InjectMocks
    private CreateCharacterDTO createCharacterDTO;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Test
    void mustTestGettersAndSetters(){
        createCharacterDTO = jogosUtil.populateCreateCharacterDTO();
        assertNotNull(createCharacterDTO);
        assertNotNull(createCharacterDTO.getGame());
        assertNotNull(createCharacterDTO.getName());
        assertNotNull(createCharacterDTO.getImageUrl());


    }



}
