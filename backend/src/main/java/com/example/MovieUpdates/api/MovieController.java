package com.example.MovieUpdates.api;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.MovieUpdates.models.Movie;
import com.example.MovieUpdates.models.MovieDBJSON;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class MovieController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/now-playing-movies")
    public List<Movie> getTheatreMovies() {
        RestTemplate restTemplate = new RestTemplate();
        MovieDBJSON movieDBjson = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/now_playing?api_key=d2ab093fe7614910d60e36efd174750a&language=en-US&page=1", MovieDBJSON.class);
        return movieDBjson.getResults();
    }

    @RequestMapping(value="/upcoming-movies")
    public List<Movie> getUpcomingMovies() {
        RestTemplate restTemplate = new RestTemplate();
        MovieDBJSON movieDBjson = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/upcoming?api_key=d2ab093fe7614910d60e36efd174750a&language=en-US&page=1", MovieDBJSON.class);
        return movieDBjson.getResults();
    }

    @GetMapping(value="/movie/{id}")
    public Movie getMovie(@PathVariable("id") String id) {
        RestTemplate restTemplate = new RestTemplate();
        Movie movie= restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/"+id+"?api_key=d2ab093fe7614910d60e36efd174750a&language=en-US&page=1", Movie.class);
        return movie;
    }

}
