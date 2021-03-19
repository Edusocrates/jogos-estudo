package com.treinamento.fiapjogos.fiapjogos.service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateCharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Repository.CharacterRepository;
import com.treinamento.fiapjogos.fiapjogos.Service.CharacterService;
import com.treinamento.fiapjogos.fiapjogos.Service.impl.CharacterServiceImpl;
import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.web.server.ResponseStatusException;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CharacterServiceTest {

    @InjectMocks
    private CharacterServiceImpl characterService;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Mock
    private CharacterRepository characterRepository;

    @Test
    void createCharacterTest(){
        Integer intMock = 123;
        CreateCharacterDTO createCharacterDTO =  jogosUtil.populateCreateCharacterDTO();
        Character character = jogosUtil.populateCharacter();
        when(characterRepository.save(any())).thenReturn(character);
        assertNotNull(characterService.createCharacter(intMock,createCharacterDTO));
    }

    @Test
    void deleteCharacterTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        assertDoesNotThrow(()->characterService.deleteCharacter(intMock,intMock));
    }

    @Test
    void getAllCharactersTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        when(characterRepository.findAll()).thenReturn(Arrays.asList(character));
        assertNotNull(characterService.getAllCharacters(intMock));
        assertNotNull(characterService.getAllCharacters(null));
    }

    @Test
    void getCharacterByIdTest(){
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        assertNotNull(characterService.getCharacterById(intMock));
        assertThrows(ResponseStatusException.class,()->characterService.getCharacterById(null));
    }
    @Test
    void updateCharacterTest(){
    //deveria testar todos as condições, porem não to afim agora :(
        Integer intMock = 123;
        Character character = jogosUtil.populateCharacter();
        CreateCharacterDTO createCharacterDTO =  jogosUtil.populateCreateCharacterDTO();
        when(characterRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(character));
        when(characterRepository.save(any())).thenReturn(character);
        assertNotNull(characterService.updateCharacter(intMock,createCharacterDTO));


    }
}
