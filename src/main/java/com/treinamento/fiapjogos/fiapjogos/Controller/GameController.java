package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.GameDTO;
import com.treinamento.fiapjogos.fiapjogos.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<CreateGameDTO> getGameList(@RequestParam(required = false) String name){
        return service.getGameList(name);
    }
    @GetMapping("{gameId}")
    public GameDTO getGameById(@RequestParam Integer gameId){
        return service.findGameById(gameId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameDTO insertGame(@RequestParam CreateGameDTO createGameDTO){
        return service.createGame(createGameDTO);
    }

    @DeleteMapping("{gameId}")
    public void deleteGame(@RequestParam Integer gameId){
        service.deleteGame(gameId);
    }

    @PutMapping({"gameId"})
    public GameDTO updateGame(@RequestParam Integer gameId,@RequestParam CreateGameDTO createGameDTO){
        return service.updateGame(gameId,createGameDTO);
    }


}
