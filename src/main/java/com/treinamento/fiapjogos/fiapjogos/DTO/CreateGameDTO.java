package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import com.treinamento.fiapjogos.fiapjogos.Entity.Character;
import com.treinamento.fiapjogos.fiapjogos.Entity.Game;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class CreateGameDTO {

    private String name;

    private Date releaseDate;

    private String imageUrl;

    private String rating;

    private Category category;

    private List<Character> characterList;

//    public CreateGameDTO(Game game) {
//        this.name = game.getName();
//        this.releaseDate = game.getReleaseDate();
//        this.imageUrl = game.getImageUrl();
//        this.rating = game.getRating();
//        this.category = game.getCategory();
//        this.characterList = game.getCharacterList()
//                .stream()
//                .map(CharacterDTO::new)
//                .collect(Collectors.toList());
//    }

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

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public CreateGameDTO(String name, Date releaseDate, String imageUrl, String rating, Category category, List<Character> characterList) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.category = category;
        this.characterList = characterList;
    }

    public CreateGameDTO() {
    }
}
