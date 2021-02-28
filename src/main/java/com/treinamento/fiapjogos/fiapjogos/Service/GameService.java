package com.treinamento.fiapjogos.fiapjogos.Service;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.GameDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface GameService {


    List<CreateGameDTO> getGameList(String name);

    GameDTO findGameById(Integer id);

    GameDTO createGame(CreateGameDTO createGameDTO);

    void deleteGame(Integer gameId);

    GameDTO updateGame(Integer gameId, CreateGameDTO createGameDTO);
}
