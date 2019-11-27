package com.gdktuts.jetpacksubmission.ui.tvshow;

public class TvShowDataModel {

    private int tvShowId;
    private String tvShowTitle;
    private String tvShowOverview;
    private double tvShowRating;
    private String tvShowPosterPath;
    private String tvShowBackdropPath;
    private String tvShowReleaseDate;
    private String tvShowGenres;

    public TvShowDataModel(int tvShowId, String tvShowTitle, String tvShowOverview, double tvShowRating,
                           String tvShowPosterPath, String tvShowBackdropPath, String tvShowReleaseDate,
                           String tvShowGenres) {

        this.tvShowId = tvShowId;
        this.tvShowTitle = tvShowTitle;
        this.tvShowOverview = tvShowOverview;
        this.tvShowRating = tvShowRating;
        this.tvShowPosterPath = tvShowPosterPath;
        this.tvShowBackdropPath = tvShowBackdropPath;
        this.tvShowReleaseDate = tvShowReleaseDate;
        this.tvShowGenres = tvShowGenres;

    }

    public int getTvShowId() {
        return tvShowId;
    }

    public String getTvShowTitle() {
        return tvShowTitle;
    }

    public String getTvShowOverview() {
        return tvShowOverview;
    }

    public double getTvShowRating() {
        return tvShowRating;
    }

    public String getTvShowPosterPath() {
        return tvShowPosterPath;
    }

    public String getTvShowBackdropPath() {
        return tvShowBackdropPath;
    }

    public String getTvShowReleaseDate() {
        return tvShowReleaseDate;
    }

    public String getTvShowGenres() {
        return tvShowGenres;
    }
}
