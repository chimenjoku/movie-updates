package com.example.MovieUpdates.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDBJSON {
    private List<Movie> results;

    public List<Movie> getResults() {
        return results;
    }
    public void setResults(List<Movie> results) {
        this.results = results;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("total_Results: " + getResults() + "\n");
        sb.append("Movie: " + getResults() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }


}
