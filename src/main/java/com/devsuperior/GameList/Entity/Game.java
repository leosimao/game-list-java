package com.devsuperior.GameList.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name = "tb_game")
public class Game {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private int gameYear;
    private String genre;
    private String platform;
    private double score;
    private String imgUrl;
    private String shortDescription;
    private String longDescriprtion;

    public Game(){
    }

    public Game(long id, String title, int gameYear, String genre, String platform, double score, 
                String imgUrl, String shortDescription, String longDescriprtion) {
        this.id = id;
        this.title = title;
        this.gameYear = gameYear;
        this.genre = genre;
        this.platform = platform;
        this.score = score;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescriprtion = longDescriprtion;
    }
}