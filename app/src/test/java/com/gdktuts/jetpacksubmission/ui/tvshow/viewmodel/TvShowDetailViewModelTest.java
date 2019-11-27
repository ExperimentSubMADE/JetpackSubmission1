package com.gdktuts.jetpacksubmission.ui.tvshow.viewmodel;

import com.gdktuts.jetpacksubmission.ui.tvshow.TvShowDataModel;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TvShowDetailViewModelTest {

    private TvShowDetailViewModel tvShowDetailViewModelTest;
    private TvShowDataModel tvShowDataModelTest;

    @Before
    public void setUp() {
        tvShowDetailViewModelTest = new TvShowDetailViewModel();
        tvShowDataModelTest = new TvShowDataModel(
                1,
                "Doom Patrol",
                "The Doom Patrol’s members each suffered horrible accidents that gave them superhuman abilities — but also left them scarred and disfigured. Traumatized and downtrodden, the team found purpose through The Chief, who brought them together to investigate the weirdest phenomena in existence — and to protect Earth from what they find.",
                65,
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg",
                "https://image.tmdb.org/t/p/w600_and_h900_bestv2/nVN7Dt0Xr78gnJepRsRLaLYklbY.jpg",
                "February 15, 2019",
                "Action & Adventure | Sci-Fi & Fantasy"
        );
    }

    @Test
    public void getTvShowDetailTest() {
        tvShowDetailViewModelTest.setTvShowId(tvShowDataModelTest.getTvShowId());
        TvShowDataModel tvShowDatasTest = tvShowDetailViewModelTest.getTvShowDetail();
        assertNotNull(tvShowDatasTest);
        assertEquals(tvShowDataModelTest.getTvShowId(), tvShowDatasTest.getTvShowId());
        assertEquals(tvShowDataModelTest.getTvShowTitle(), tvShowDatasTest.getTvShowTitle());
        assertEquals(tvShowDataModelTest.getTvShowOverview(), tvShowDatasTest.getTvShowOverview());
        assertEquals(tvShowDataModelTest.getTvShowRating(), tvShowDatasTest.getTvShowRating(), 0);
        assertEquals(tvShowDataModelTest.getTvShowPosterPath(), tvShowDatasTest.getTvShowPosterPath());
        assertEquals(tvShowDataModelTest.getTvShowBackdropPath(), tvShowDatasTest.getTvShowBackdropPath());
        assertEquals(tvShowDataModelTest.getTvShowReleaseDate(), tvShowDatasTest.getTvShowReleaseDate());
        assertEquals(tvShowDataModelTest.getTvShowGenres(), tvShowDatasTest.getTvShowGenres());
    }

    @Test
    public void getTvShowIdTest() {
        tvShowDetailViewModelTest.setTvShowId(tvShowDataModelTest.getTvShowId());
        assertEquals(tvShowDataModelTest.getTvShowId(), tvShowDetailViewModelTest.getTvShowId());
    }
}
