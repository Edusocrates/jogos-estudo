package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.GameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.SimpleGameDTO;
import com.treinamento.fiapjogos.fiapjogos.Service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("games")
public class GameController {

    @Autowired
    private GameService service;

    @GetMapping
    public List<SimpleGameDTO> getGameList(@RequestParam(required = false) String name){
        return service.getGameList(name);
    }
    @GetMapping("{gameId}")
    public GameDTO getGameById(@RequestParam Integer gameId){
        return service.findGameById(gameId);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public GameDTO insertGame(@RequestBody CreateGameDTO createGameDTO){
        return service.createGame(createGameDTO);
    }

    @DeleteMapping("{gameId}")
    public ResponseEntity<?> deleteGame(@RequestParam Integer gameId){
        service.deleteGame(gameId);
        return ResponseEntity.ok(null);
    }

    @PutMapping({"gameId"})
    public ResponseEntity<GameDTO> updateGame(@RequestParam Integer gameId,@RequestParam CreateGameDTO createGameDTO){
          GameDTO gameDTO = service.updateGame(gameId,createGameDTO);
         return ResponseEntity.ok(gameDTO);
    }


}
