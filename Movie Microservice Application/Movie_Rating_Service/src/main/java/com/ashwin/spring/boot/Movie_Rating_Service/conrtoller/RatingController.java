package com.ashwin.spring.boot.Movie_Rating_Service.conrtoller;

import com.ashwin.spring.boot.Movie_Rating_Service.model.Rating;
import com.ashwin.spring.boot.Movie_Rating_Service.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rating")
public class RatingController {

    @RequestMapping("/{movieId}")
    public Rating getRating(@PathVariable("movieId") String movieId) {
        return new Rating(movieId, 4);
    }

    @RequestMapping("/users/{userId}")
    public UserRating getUserRatingList(@PathVariable("userId") String userId) {
        List<Rating> ratingList = Arrays.asList(
                new Rating("124", 4),
                new Rating("546", 3)
        );
        UserRating userRating = new UserRating();
        userRating.setRatingList(ratingList);
        return userRating;
    }
}
