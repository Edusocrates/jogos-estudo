package com.treinamento.fiapjogos.fiapjogos.Service.impl;

import com.treinamento.fiapjogos.fiapjogos.DTO.CharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.CreateCharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import com.treinamento.fiapjogos.fiapjogos.Repository.CharacterRepository;
import com.treinamento.fiapjogos.fiapjogos.Service.CharacterService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CharacterServiceImpl implements CharacterService {

    @Autowired
    private CharacterRepository repository;

    @Override
    public CharacterDTO createCharacter(Integer gameId,CreateCharacterDTO createCharacterDTO) {
        Character character = new Character();
        character.setName(createCharacterDTO.getName());
        character.setImageUrl(createCharacterDTO.getImageUrl());

        Game game = new Game();
        game.setId(gameId);
        character.setGame(game);

        Character savedCharacter = repository.save(character);
        return new CharacterDTO(savedCharacter);
    }

    @Override
    public void deleteCharacter(Integer gameId, Integer characterId) {
        Character character = repository.findById(characterId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND,
                        "Character não encontrado !!"));
        if(!character.getGame().getId().equals(gameId)){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Jogo incorreto !");
        }
        repository.delete(character);
    }
    @Override
    public List<CharacterDTO> getAllCharacters(Integer characterId) {
        if(characterId != null ){
            return repository.findAll().stream().map(Character::toFullDTO)
                    .filter(c -> c.getId().equals(characterId))
                    .sorted(Comparator.comparingInt(CharacterDTO::getId)).collect(Collectors.toList());
        }else{
            return   repository.findAll().stream().map(Character::toFullDTO)
                    .sorted(Comparator.comparingInt(CharacterDTO::getId)).collect(Collectors.toList());
        }

    }

    @Override
    public CharacterDTO getCharacterById(Integer characterId) {
        if(characterId != null){
            Character character = repository.findById(characterId)
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Personagem Não encontrado !!"));
            return new CharacterDTO(character);

        }else{
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Id de personagem null");
        }
    }

    @Override
    public CharacterDTO updateCharacter(Integer characterId, CreateCharacterDTO createCharacterDTO) {
        if(characterId != null){
            Character character = repository.findById(characterId)
                    .orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,"Personagem não encontrado"));
            if(createCharacterDTO.getName() == null || createCharacterDTO.getName().isEmpty()){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Não pode deixar o nome nulo");
            }
            if(createCharacterDTO.getImageUrl() == null || createCharacterDTO.getImageUrl().isEmpty()){
                throw new ResponseStatusException(HttpStatus.BAD_REQUEST,"Não pode deixar a imagem null");
            }
            BeanUtils.copyProperties(createCharacterDTO, character);
            Character updatedCharacter = repository.save(character);
            return new CharacterDTO(updatedCharacter);
        }
        return null;
    }
//
//    @Override
//    public List<CharacterDTO> findCharacterById(Integer characterId) {
//        if(characterId != null ){
//            return repository.findAll().stream().map(Characters::toFullDTO)
//                    .filter(c -> c.getId().equals(characterId))
//                    .sorted(Comparator.comparingInt(CharacterDTO::getId)).collect(Collectors.toList());
//        }else{
//            return   repository.findAll().stream().map(Characters::toFullDTO)
//                    .sorted(Comparator.comparingInt(CharacterDTO::getId)).collect(Collectors.toList());
//        }
//    }


}
