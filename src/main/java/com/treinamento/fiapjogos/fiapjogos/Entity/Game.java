package com.treinamento.fiapjogos.fiapjogos.Entity;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_GAME")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String name;

    @Column
    @Temporal(value = TemporalType.DATE)
    private Date releaseDate;

    @Column
    private String imageUrl;

    @Column
    private String rating;

    @Column
    @Enumerated(EnumType.STRING)
    private Category category;

    @OneToMany
    @JoinColumn(name = "game_id")
    private List<Character> characterList = new ArrayList<>();

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

    public List<Character> getCharacterList() {
        return characterList;
    }

    public void setCharacterList(List<Character> characterList) {
        this.characterList = characterList;
    }

    public Game(Integer id, String name, Date releaseDate, String imageUrl, String rating, Category category, List<Character> characterList) {
        this.id = id;
        this.name = name;
        this.releaseDate = releaseDate;
        this.imageUrl = imageUrl;
        this.rating = rating;
        this.category = category;
        this.characterList = characterList;
    }

    public Game() {
    }
}
