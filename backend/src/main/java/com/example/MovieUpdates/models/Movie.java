package com.example.MovieUpdates.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private int id;
    private String title;
    private String poster_path;
    private String backdrop_path;
    private String overview;
    private String release_date;

    public Movie() {
    }

    /*Getter and Setter Methods*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }

    @Override
    public String toString() {
        return "Movies{" +
                "id='" + getId() + ',' +
                "title=" + getTitle() + ',' +
                "poster_path=" + getPoster_path() + ',' +
                "backdrop_path=" + getBackdrop_path() + ',' +
                "overview=" + getOverview() + ',' +
                "release_date=" + getRelease_date() +
                '}';
    }
}
