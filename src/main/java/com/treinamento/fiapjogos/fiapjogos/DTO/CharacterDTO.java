package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;


public class CharacterDTO {

    private Integer id;

    private String name;

    private String imageUrl;

    private Game game;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public CharacterDTO(Character character) {
        this.id = character.getId();
        this.game = character.getGame();
        this.imageUrl = character.getImageUrl();
        this.name = character.getName();
    }

    public CharacterDTO() {
    }


}
