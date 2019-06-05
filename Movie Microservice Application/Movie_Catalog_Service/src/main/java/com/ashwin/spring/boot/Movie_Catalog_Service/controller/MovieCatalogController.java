package com.ashwin.spring.boot.Movie_Catalog_Service.controller;

import com.ashwin.spring.boot.Movie_Catalog_Service.model.Movie;
import com.ashwin.spring.boot.Movie_Catalog_Service.model.MovieCatalogItem;
import com.ashwin.spring.boot.Movie_Catalog_Service.model.UserRating;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/catalog")
public class MovieCatalogController {

    @Resource
    RestTemplate restTemplate;

    @Resource
    WebClient.Builder builder;

    @RequestMapping(value = "/{userId}")
    public List<MovieCatalogItem> getMovieCatalog(@PathVariable("userId") String userId) {

        UserRating userRating = restTemplate.getForObject("http://movie-rating-service/rating/users/" + userId, UserRating.class);
        //ParameterizedTypeReference<List<Rating>> if it is contain List
        return userRating.getRatingList().stream().map(rating -> {
            // For each movie id , call movie information service and get details.
            Movie movie = restTemplate.getForObject("http://movie-information-service/movies/" + rating.getMovieId(), Movie.class);
            // Put them all together
            return new MovieCatalogItem(movie.getMovieName(), "Desc", rating.getRating());
        }).collect(Collectors.toList());
    }

    /*
                Movie movie = builder.build()
                    .get()  //Rest call like POST, GET, DELETE etc
                    .uri("http://localhost:8082/movies/" + rating.getMovieId())
                    .retrieve() //Return response in REST
                    .bodyToMono(Movie.class)    //Convert response body to Object. It means you get object in future.
                    .block();   /* Until you get object it holds the execution. Blocking execution until execute mono.
                      Converting asynchronous to synchronous
                    */


}
