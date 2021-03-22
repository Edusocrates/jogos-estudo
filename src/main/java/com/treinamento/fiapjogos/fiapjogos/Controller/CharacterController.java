package com.treinamento.fiapjogos.fiapjogos.Controller;

import com.treinamento.fiapjogos.fiapjogos.DTO.CharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.DTO.CreateCharacterDTO;
import com.treinamento.fiapjogos.fiapjogos.Service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games/{gameId}/characters")
public class CharacterController {

    @Autowired
    private CharacterService service;

    //endpoint simplificado para buscar um personagem através do seu id(sem olhar o game)
    @GetMapping
    public CharacterDTO getCharacter(@PathVariable Integer characterId){
        return service.getCharacterById(characterId);
    }
    @GetMapping("/all-characters/{characterId}")
   // @ApiOperation("criei esse endpoint para retornar todos os personagens existentes")
    public List<CharacterDTO> getAllCharacters(@PathVariable(required = false) Integer characterId){

    return service.getAllCharacters(characterId);
}

    @PostMapping
    public CharacterDTO addCharacter(@PathVariable Integer gameId, @RequestBody CreateCharacterDTO createCharacterDTO){
        return service.createCharacter(gameId,createCharacterDTO);
    }

    @DeleteMapping("{characterId}")
    public ResponseEntity<?> deleteCharacter(@PathVariable Integer gameId, @PathVariable Integer characterId){
        service.deleteCharacter(gameId,characterId);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<CharacterDTO> updateCharacter(@PathVariable Integer characterId,@RequestBody CreateCharacterDTO createCharacterDTO){
        CharacterDTO characterDTO = service.updateCharacter(characterId,createCharacterDTO);
        return ResponseEntity.ok(characterDTO);
    }




}
