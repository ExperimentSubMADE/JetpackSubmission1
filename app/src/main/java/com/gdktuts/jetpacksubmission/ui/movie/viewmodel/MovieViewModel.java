package com.gdktuts.jetpacksubmission.ui.movie.viewmodel;

import androidx.lifecycle.ViewModel;

import com.gdktuts.jetpacksubmission.ui.movie.MovieDataModel;
import com.gdktuts.jetpacksubmission.utils.ContentDataDummy;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel {

    public ArrayList<MovieDataModel> getMovies() {
        return ContentDataDummy.movieDataDummies();
    }

}
