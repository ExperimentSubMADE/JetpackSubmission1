package com.gdktuts.jetpacksubmission.ui.movie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.gdktuts.jetpacksubmission.ui.movie.MovieDataModel;
import com.gdktuts.jetpacksubmission.utils.ContentDataDummy;

public class MovieDetailViewModel extends ViewModel {

    private MovieDataModel movieDataModel;
    private int movieId;

    public MovieDataModel getMovieDetail() {
        for (int i=0; i < ContentDataDummy.movieDataDummies().size(); i++) {
            MovieDataModel movieDatas = ContentDataDummy.movieDataDummies().get(i);
            if (movieId == movieDatas.getMovieId()) {
                movieDataModel = movieDatas;
            }
        }
        return movieDataModel;
    }

    int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }
}
