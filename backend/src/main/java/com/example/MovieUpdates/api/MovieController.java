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

    @RequestMapping(value="/movies-in-theatres")
    public List<Movie> getTheatreMovies() {
        RestTemplate restTemplate = new RestTemplate();
        MovieDB_JSON movieDB_json = restTemplate.getForObject(
                "https://api.themoviedb.org/3/discover/movie?api_key=d2ab093fe7614910d60e36efd174750a&primary_release_date.gte=2019-09-01&primary_release_date.lte=2019-09-22", MovieDB_JSON.class);
        return movieDB_json.getResults();
    }

    /*
    @RequestMapping("/upcomingMovies")
    public List<Movie> getUpcomingMovies() {
        Sort sortByCreatedAtDesc = new Sort(Sort.Direction.DESC, "createdAt");
        return todoItemRepository.findAll(sortByCreatedAtDesc);
    }
 */

}
