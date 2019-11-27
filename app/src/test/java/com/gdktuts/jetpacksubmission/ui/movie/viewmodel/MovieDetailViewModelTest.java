package com.gdktuts.jetpacksubmission.ui.movie.viewmodel;

import com.gdktuts.jetpacksubmission.ui.movie.MovieDataModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieDetailViewModelTest {

    private MovieDetailViewModel movieDetailViewModelTest;
    private MovieDataModel movieDataModelTest;

    @Before
    public void setUp() {
        movieDetailViewModelTest = new MovieDetailViewModel();
        movieDataModelTest = new MovieDataModel(
                1,
                "A Star Is Born",
                "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally\'s career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
                75,
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg",
                "October 3, 2018",
                "Drama | Music | Romance"
        );
    }

    @Test
    public void getMovieDetailTest() {
        movieDetailViewModelTest.setMovieId(movieDataModelTest.getMovieId());
        MovieDataModel movieDatasTest = movieDetailViewModelTest.getMovieDetail();
        assertNotNull(movieDatasTest);
        assertEquals(movieDataModelTest.getMovieId(), movieDatasTest.getMovieId());
        assertEquals(movieDataModelTest.getMovieTitle(), movieDatasTest.getMovieTitle());
        assertEquals(movieDataModelTest.getMovieOverview(), movieDatasTest.getMovieOverview());
        assertEquals(movieDataModelTest.getMovieRating(), movieDatasTest.getMovieRating(), 0);
        assertEquals(movieDataModelTest.getMoviePosterPath(), movieDatasTest.getMoviePosterPath());
        assertEquals(movieDataModelTest.getMovieBackdropPath(), movieDatasTest.getMovieBackdropPath());
        assertEquals(movieDataModelTest.getMovieReleaseDate(), movieDatasTest.getMovieReleaseDate());
        assertEquals(movieDataModelTest.getMovieGenres(), movieDatasTest.getMovieGenres());
    }

    @Test
    public void getMovieIdTest() {
        movieDetailViewModelTest.setMovieId(movieDataModelTest.getMovieId());
        assertEquals(movieDataModelTest.getMovieId(), movieDetailViewModelTest.getMovieId());
    }

}