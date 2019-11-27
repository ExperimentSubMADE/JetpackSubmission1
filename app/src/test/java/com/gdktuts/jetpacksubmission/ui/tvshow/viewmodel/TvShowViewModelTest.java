package com.gdktuts.jetpacksubmission.ui.tvshow.viewmodel;

import com.gdktuts.jetpacksubmission.ui.tvshow.TvShowDataModel;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TvShowViewModelTest {

    private TvShowViewModel tvShowViewModelTest;

    @Before
    public void setUp() {
        tvShowViewModelTest = new TvShowViewModel();
    }

    @Test
    public void getTvShowTest() {
        ArrayList<TvShowDataModel> tvShowDataModelTest = tvShowViewModelTest.getTvShows();
        assertNotNull(tvShowDataModelTest);
        assertEquals(10, tvShowDataModelTest.size());
    }

}