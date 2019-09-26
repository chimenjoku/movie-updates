package com.example.MovieUpdates.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Movie {
    private int id;
    private int popularity;
    private int vote_count;
    private int vote_average;
    private boolean video;
    private boolean adult;
    private int[] genre_ids;
    private String title;
    private String original_language;
    private String original_title;
    private String overview;
    private String poster_path;
    private String backdrop_path;
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

    public int getVote_average() {
        return vote_average;
    }

    public void setVote_average(int vote_average) {
        this.vote_average = vote_average;
    }

    public boolean getAdult() {
        return adult;
    }
    public void setAdult(boolean adult) {
        this.adult = adult;
    }

    public boolean getVideo() {
        return video;
    }
    public void setVideo(boolean video) {
        this.video = video;
    }

    public int[] getGenre_ids() {
        return genre_ids;
    }

    public void setGenre_ids(int[] genre_ids) {
        this.genre_ids = genre_ids;
    }

    public int getVote_count() {
        return vote_count;
    }
    public void setVote_count(int vote_count) {
        this.vote_count = vote_count;
    }

    public int getPopularity() {
        return popularity;
    }
    public void setPopularity(int popularity) {
        this.popularity = popularity;
    }

    public String getOriginal_language() {
        return original_language;
    }

    public void setOriginal_language(String original_language) {
        this.original_language = original_language;
    }

    public String getOriginal_title() {
        return original_title;
    }

    public void setOriginal_title(String original_title) {
        this.original_title = original_title;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getBackdrop_path() {
        return backdrop_path;
    }

    public void setBackdrop_path(String backdrop_path) {
        this.backdrop_path = backdrop_path;
    }

    public String getPoster_path() {
        return poster_path;
    }

    public void setPoster_path(String poster_path) {
        this.poster_path = poster_path;
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
                "popularity='" + getPopularity() + ',' +
                "vote_count='" + getVote_count() + ',' +
                "video='" + getVideo() + ',' +
                "poster_path='" + getPoster_path() + ',' +
                "id='" + getId() + ',' +
                "adult='" + getAdult() + ',' +
                "backdrop_path='" + getBackdrop_path() + ',' +
                "original_language='" + getOriginal_language() + ',' +
                "original_title='" + getOriginal_title() + ',' +
                "genre_ids='" + Arrays.toString(getGenre_ids())  + ',' +
                "title='" + getTitle() + ',' +
                "vote_average='" + getVote_average() + ',' +
                "overview='" + getOverview() + ',' +
                ", release_date=" + release_date +
                '}';
    }
}
