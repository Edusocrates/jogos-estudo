package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
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

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.lenient;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class GameControllerTest {

    @InjectMocks
    private GameController gameController;

    @InjectMocks
    private JogosUtil jogosUtil;

    @Mock
    private GameRepository gameRepository;

    @Mock
    private GameService gameService;

    @Test
    void getGameListTest(){
        String stringMock = "teste";
        Game game = jogosUtil.populateGame();
        lenient().when(gameRepository.findAll()).thenReturn(Arrays.asList(game));
        assertNotNull(gameController.getGameList(stringMock));
    }

    @Test
    void getGameByIdTest(){
        Integer intMock = 123;
        Game game = jogosUtil.populateGame();
        lenient().when(gameRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(game));
        assertNull(gameController.getGameById(intMock));
    }
   @Test
    void insertGameTest(){
       CreateGameDTO createGameDTO = jogosUtil.populateCreateGameDTO();
       Game game = jogosUtil.populateGame();
       lenient().when(gameRepository.save(any())).thenReturn(java.util.Optional.ofNullable(game));
       assertNull(gameController.insertGame(createGameDTO));
   }
   @Test
    void deleteGameTest(){
        Integer intMock = 123;
       assertDoesNotThrow(()->gameController.deleteGame(intMock));
   }
    @Test
    void updateGameTest(){
        Integer intMock = 123;
        Game game = jogosUtil.populateGame();
        lenient().when(gameRepository.save(any())).thenReturn(java.util.Optional.ofNullable(game));
        CreateGameDTO createGameDTO = jogosUtil.populateCreateGameDTO();
        lenient().when(gameRepository.findById(any())).thenReturn(java.util.Optional.ofNullable(game));
        assertNotNull(gameController.updateGame(intMock,createGameDTO));
    }



}
