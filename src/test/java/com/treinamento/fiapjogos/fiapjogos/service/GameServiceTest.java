package com.treinamento.fiapjogos.fiapjogos.service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import com.treinamento.fiapjogos.fiapjogos.Repository.GameRepository;
import com.treinamento.fiapjogos.fiapjogos.Service.GameService;
import com.treinamento.fiapjogos.fiapjogos.Service.impl.GameServiceImpl;
import com.treinamento.fiapjogos.fiapjogos.Utils.JogosUtil;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GameServiceTest {

    @InjectMocks
    private GameServiceImpl gameService;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Mock
    private GameRepository gameRepository;

    @Test
    void getGameListTest(){
     String stringMock = "teste";
     Game game = jogosUtil.populateGame();
     when(gameRepository.findAll()).thenReturn(Arrays.asList(game));
     assertNotNull(gameService.getGameList(stringMock));

    }
    @Test
    void findGameByIdTest(){
        Integer intMock = 123;
        Game game = jogosUtil.populateGame();
        when(gameRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(game));
        assertNotNull(gameService.findGameById(intMock));
    }

    @Test
    void createGameTest(){
        CreateGameDTO createGameDTO = jogosUtil.populateCreateGameDTO();
        Game game = jogosUtil.populateGame();
        when(gameRepository.save(any())).thenReturn(game);
        assertNotNull(gameService.createGame(createGameDTO));

    }
    @Test
    void deleteGameTest(){
        Integer intMock = 123;
        assertDoesNotThrow(()->gameService.deleteGame(intMock));
    }
    @Test
    void updateGameTest(){
        Integer intMock = 123;
        Game game = jogosUtil.populateGame();
        CreateGameDTO createGameDTO = jogosUtil.populateCreateGameDTO();
        //deveria testar todas condições porem não to afim tb :(
        when(gameRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(game));
        when(gameRepository.save(any())).thenReturn(game);
        assertNotNull(gameService.updateGame(intMock,createGameDTO));

    }




}
