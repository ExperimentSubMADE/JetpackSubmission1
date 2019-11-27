package com.gdktuts.jetpacksubmission.ui.movie.viewmodel;

import com.gdktuts.jetpacksubmission.ui.movie.MovieDataModel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MovieViewModelTest {

    private MovieViewModel movieViewModelTest;

    @Before
    public void setUp() {
        movieViewModelTest = new MovieViewModel();
    }

    @Test
    public void getMovieTest() {
        ArrayList<MovieDataModel> movieDataModelTest = movieViewModelTest.getMovies();
        assertNotNull(movieDataModelTest);
        assertEquals(10, movieDataModelTest.size());
    }


}