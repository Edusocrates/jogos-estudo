package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(MockitoExtension.class)
public class CharacterDTOTest {

    @Mock
    private CharacterDTO characterDTO;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Test
    void mustTestGetterAndSetter(){
        characterDTO = jogosUtil.populateCharacterDTO();
        assertNotNull(characterDTO);
        assertNotNull(characterDTO.getGame());
        assertNotNull(characterDTO.getName());
        assertNotNull(characterDTO.getImageUrl());
        assertNotNull(characterDTO.getId());
    }



}
