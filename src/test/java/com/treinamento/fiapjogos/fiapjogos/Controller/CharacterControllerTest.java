package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateCharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Repository.CharacterRepository;
import com.treinamento.fiapjogos.fiapjogos.Service.CharacterService;
import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CharacterControllerTest {

    @InjectMocks
    private CharacterController characterController;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Mock
    private CharacterService characterService;

    @Mock
    private CharacterRepository characterRepository;

    @Test
    void getCharacter(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        lenient().when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        assertNull(characterController.getCharacter(intMock));
    }
    @Test
    void getAllCharactersTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        lenient().when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        lenient().when(characterRepository.findAll()).thenReturn(Arrays.asList(character));
        assertNotNull(characterController.getAllCharacters(intMock));
        assertNotNull(characterController.getAllCharacters(null));
    }
    @Test
    void addCharacterTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        CreateCharacterDTO createCharacterDTO = jogosUtil.populateCreateCharacterDTO();
        lenient().when(characterRepository.save(any())).thenReturn(character);
        assertNull(characterController.addCharacter(intMock,createCharacterDTO));
    }
    @Test
    void deleteCharacterTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        lenient().when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        assertNotNull(characterController.deleteCharacter(intMock,intMock));
    }
    @Test
    void updateCharacterTest(){
        CreateCharacterDTO createCharacterDTO = jogosUtil.populateCreateCharacterDTO();
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        lenient().when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        lenient().when(characterRepository.save(any())).thenReturn(character);
        assertNotNull(characterController.updateCharacter(intMock,createCharacterDTO));

    }




}
