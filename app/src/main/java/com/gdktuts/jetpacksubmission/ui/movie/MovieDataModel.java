package com.gdktuts.jetpacksubmission.ui.movie;

public class MovieDataModel {

    private int movieId;
    private String movieTitle;
    private String movieOverview;
    private double movieRating;
    private String moviePosterPath;
    private String movieBackdropPath;
    private String movieReleaseDate;
    private String movieGenres;

    public MovieDataModel(int movieId, String movieTitle, String movieOverview, double movieRating,
                          String moviePosterPath, String movieBackdropPath, String movieReleaseDate,
                          String movieGenres) {

        this.movieId = movieId;
        this.movieTitle = movieTitle;
        this.movieOverview = movieOverview;
        this.movieRating = movieRating;
        this.moviePosterPath = moviePosterPath;
        this.movieBackdropPath = movieBackdropPath;
        this.movieReleaseDate = movieReleaseDate;
        this.movieGenres = movieGenres;

    }

    public int getMovieId() {
        return movieId;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieOverview() {
        return movieOverview;
    }

    public double getMovieRating() {
        return movieRating;
    }

    public String getMoviePosterPath() {
        return moviePosterPath;
    }

    public String getMovieBackdropPath() {
        return movieBackdropPath;
    }

    public String getMovieReleaseDate() {
        return movieReleaseDate;
    }

    public String getMovieGenres() {
        return movieGenres;
    }
}
