package com.treinamento.fiapjogos.fiapjogos.DTO;

import com.treinamento.fiapjogos.fiapjogos.Entity.Category;
import java.util.Date;
import java.util.List;

public class CreateGameDTO {

    private String name;

    private Date releaseDate;

    private String imageUrl;

    private String rating;

    private Category category;

    private List<CharacterDTO> characterList;

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

    public CreateGameDTO(String name, Date releaseDate, String imageUrl, String rating, Category category, List<CharacterDTO> characterList) {
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
