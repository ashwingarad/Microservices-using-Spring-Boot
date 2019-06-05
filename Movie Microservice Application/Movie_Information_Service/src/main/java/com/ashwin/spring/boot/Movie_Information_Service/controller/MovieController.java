package com.ashwin.spring.boot.Movie_Information_Service.controller;

import com.ashwin.spring.boot.Movie_Information_Service.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, "Sherlock Holmes");
    }
}
