package com.whysoserious.neeraj.popularmovies1.tmdb_api;

import java.util.List;

/**
 * Created by Neeraj on 29-Mar-16.
 */
public class ListResponse {
    List<MovieModel> results;
    int page;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List<MovieModel> getResults() {
        return results;
    }

    public void setResults(List<MovieModel> results) {
        this.results = results;
    }
}
