package com.example.MovieUpdates.api;

import javax.validation.Valid;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.MovieUpdates.models.Movie;
import com.example.MovieUpdates.models.MovieDB_JSON;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
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
        MovieDB_JSON movieDB_json = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/now_playing?api_key=d2ab093fe7614910d60e36efd174750a&language=en-US&page=1", MovieDB_JSON.class);
        return movieDB_json.getResults();
    }

    @RequestMapping(value="/upcoming-movies")
    public List<Movie> getUpcomingMovies() {
        RestTemplate restTemplate = new RestTemplate();
        MovieDB_JSON movieDB_json = restTemplate.getForObject(
                "https://api.themoviedb.org/3/movie/upcoming?api_key=d2ab093fe7614910d60e36efd174750a&language=en-US&page=1", MovieDB_JSON.class);
        return movieDB_json.getResults();
    }


}
