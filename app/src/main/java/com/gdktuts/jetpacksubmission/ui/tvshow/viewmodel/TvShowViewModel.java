package com.gdktuts.jetpacksubmission.ui.tvshow.viewmodel;

import androidx.lifecycle.ViewModel;

import com.gdktuts.jetpacksubmission.ui.tvshow.TvShowDataModel;
import com.gdktuts.jetpacksubmission.utils.ContentDataDummy;

import java.util.ArrayList;

public class TvShowViewModel extends ViewModel {

    public ArrayList<TvShowDataModel> getTvShows() {
        return ContentDataDummy.tvShowDataDummies();
    }

}
