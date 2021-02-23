package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Game;



public class CreateCharacterDTO {

    private String name;

    private String imageUrl;

    private Game game;

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

    public CreateCharacterDTO(String name, String imageUrl, Game game) {
        this.name = name;
        this.imageUrl = imageUrl;
        this.game = game;
    }

    public CreateCharacterDTO() {
    }
}
