package com.ashwin.spring.boot.Movie_Rating_Service.model;

import java.util.List;

public class UserRating {
    private List<Rating> ratingList;

    public UserRating() {
    }

    public UserRating(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }

    public List<Rating> getRatingList() {
        return ratingList;
    }

    public void setRatingList(List<Rating> ratingList) {
        this.ratingList = ratingList;
    }
}
