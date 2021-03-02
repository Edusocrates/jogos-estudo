package com.treinamento.fiapjogos.fiapjogos.Entity;


import com.treinamento.fiapjogos.fiapjogos.DTO.CharacterDTO;

import javax.persistence.*;

@Entity
@Table(name = "TB_CHARACTER")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    private String imageUrl;

    @ManyToOne
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

    public Character(Integer id, String name, String imageUrl, Game game) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.game = game;
    }

    public Character() {
    }
    public static CharacterDTO toFullDTO(Character character){
        CharacterDTO characterDTO = new CharacterDTO();
        characterDTO.setId(character.getId());
        characterDTO.setName(character.getName());
        characterDTO.setImageUrl(character.getImageUrl());

        return characterDTO;
    }
    public static Character fromDTO(CharacterDTO characterDTO){
        Character character = new Character();
        character.setId(characterDTO.getId());
        character.setName(characterDTO.getName());
        character.setImageUrl(characterDTO.getImageUrl());

        return character;
    }
}
