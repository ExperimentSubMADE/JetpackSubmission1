package com.gdktuts.jetpacksubmission.ui.tvshow.viewmodel;

import androidx.lifecycle.ViewModel;

import com.gdktuts.jetpacksubmission.ui.tvshow.TvShowDataModel;
import com.gdktuts.jetpacksubmission.utils.ContentDataDummy;

public class TvShowDetailViewModel extends ViewModel {

    private TvShowDataModel tvShowDataModel;
    private int tvShowId;

    public TvShowDataModel getTvShowDetail() {
        for (int i=0; i < ContentDataDummy.tvShowDataDummies().size(); i++) {
            TvShowDataModel tvShowDatas = ContentDataDummy.tvShowDataDummies().get(i);
            if (tvShowId == tvShowDatas.getTvShowId()) {
                tvShowDataModel = tvShowDatas;
            }
        }
        return tvShowDataModel;
    }

    int getTvShowId() {
        return tvShowId;
    }

    public void setTvShowId(int tvShowId) {
        this.tvShowId = tvShowId;
    }
}
