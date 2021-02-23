package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;


public class GameDTO {

    private Integer id;

    private String name;

    private Date releaseDate;

    private String imageUrl;

    private String rating;

    private Category category;

    private List<CharacterDTO> characterList;


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

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<CharacterDTO> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<CharacterDTO> characterList) {
        this.characterList = characterList;
    }

    public GameDTO(Game game){
        this.id = game.getId();
        this.category = game.getCategory();
        this.name = game.getName();
        this.imageUrl = game.getImageUrl();
        this.rating = game.getRating();
        this.releaseDate = game.getReleaseDate();
        this.characterList = game.getCharacterList()
                .stream()
                .map(CharacterDTO::new)
                .collect(Collectors.toList());
    }

    public GameDTO() {
    }

}
