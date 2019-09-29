package com.example.MovieUpdates.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Arrays;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class MovieDB_JSON {
    private List<Movie> results;
    private int total_results;
    private int page;
    private int total_pages;


    public List<Movie> getResults() {
        return results;
    }
    public void setResults(List<Movie> results) {
        this.results = results;
    }

    public int getTotal_results() {
        return total_results;
    }

    public void setTotal_results(int total_results) {
        this.total_results = total_results;
    }

    public int getTotal_pages() {
        return total_pages;
    }
    public void setTotal_pages(int total_pages) {
        this.total_pages = total_pages;
    }

    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("page: " + getPage() + "\n");
        sb.append("total_results: " + getResults() + "\n");
        sb.append("total_pages: " + getTotal_pages() + "\n");
        sb.append("Movie: " + getResults() + "\n");
        sb.append("*****************************");
        return sb.toString();
    }


}
