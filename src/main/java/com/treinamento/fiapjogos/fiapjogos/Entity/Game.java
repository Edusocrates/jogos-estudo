package com.treinamento.fiapjogos.fiapjogos.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "TB_GAME")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
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
}
