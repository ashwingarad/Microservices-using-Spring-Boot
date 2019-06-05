package com.ashwin.spring.boot.Movie_Catalog_Service.model;

public class MovieCatalogItem {
    private String movieName;
    private String desc;
    private Integer rating;

    public MovieCatalogItem(String movieName, String desc, Integer rating) {
        this.movieName = movieName;
        this.desc = desc;
        this.rating = rating;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
