package com.treinamento.fiapjogos.fiapjogos.Service.impl;

import com.treinamento.fiapjogos.fiapjogos.DTO.CreateGameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.GameDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.SimpleGameDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import com.treinamento.fiapjogos.fiapjogos.Repository.GameRepository;
import com.treinamento.fiapjogos.fiapjogos.Service.GameService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class GameServiceImpl implements GameService {

    @Autowired
    private GameRepository repository;

    @Override
    public List<SimpleGameDTO> getGameList(String name) {
        List<Game> gameList = repository.findAll();
        return gameList.stream()
                .filter(game -> name == null || game.getName().startsWith(name))
                .map(SimpleGameDTO::new).collect(Collectors.toList());
    }

    @Override
    public GameDTO findGameById(Integer id) {
        Game game = getGameById(id);
        return new GameDTO(game);
    }

    @Override
    public GameDTO createGame(CreateGameDTO createGameDTO) {
        Game game = new Game();
        game.setName(createGameDTO.getName());
        game.setCategory(createGameDTO.getCategory());
        game.setImageUrl(createGameDTO.getImageUrl());
        game.setRating(createGameDTO.getRating());
        game.setReleaseDate(createGameDTO.getReleaseDate());
        Game savedGame = repository.save(game);
        return new GameDTO(savedGame);
    }

    @Override
    public void deleteGame(Integer gameId) {
        repository.deleteById(gameId);
    }

    @Override
    public GameDTO updateGame(Integer gameId, CreateGameDTO createGameDTO) {
        Game game = getGameById(gameId);
        //uma forma de atualizar seria setando tudo manual
//        game.setReleaseDate(createGameDTO.getReleaseDate());
//        game.setRating(createGameDTO.getRating());
//        game.setImageUrl(createGameDTO.getImageUrl());
//        game.setName(createGameDTO.getName());
//        game.setCategory(createGameDTO.getCategory());
        //outra forma de atualizar é utilizandoo o BeanUtils para fazer o processo automatico
        if(createGameDTO.getName() == null || createGameDTO.getName().isEmpty()){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Não pode deixar o nome nulo");
        }
        BeanUtils.copyProperties(createGameDTO,game);
        Game updatedGame = repository.save(game);
        return new GameDTO(updatedGame);
    }

    private Game getGameById(Integer id) {
       return repository.findById(id)
               .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
