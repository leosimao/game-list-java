package com.devsuperior.GameList.DTO;

import com.devsuperior.GameList.Entity.Game;

public class GameMinDTO {
    private long id;
    private String title;
    private String genre;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO(){
    }   

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.genre = entity.getGenre();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }

    public long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public String getGenre() {
        return this.genre;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public String getShortDescription() {
        return this.shortDescription;
    }

}

