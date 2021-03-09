package com.treinamento.fiapjogos.fiapjogos.Service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.GameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.SimpleGameDTO;

import java.util.List;


public interface GameService {


    List<SimpleGameDTO> getGameList(String name);

    GameDTO findGameById(Integer id);

    GameDTO createGame(CreateGameDTO createGameDTO);

    void deleteGame(Integer gameId);

    GameDTO updateGame(Integer gameId, CreateGameDTO createGameDTO);
}
