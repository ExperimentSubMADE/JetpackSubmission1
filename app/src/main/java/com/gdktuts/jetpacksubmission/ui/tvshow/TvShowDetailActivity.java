package com.gdktuts.jetpacksubmission.ui.tvshow;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.gdktuts.jetpacksubmission.R;
import com.gdktuts.jetpacksubmission.ui.tvshow.viewmodel.TvShowDetailViewModel;
import com.gdktuts.jetpacksubmission.utils.GlideApp;

import java.text.DecimalFormat;

public class TvShowDetailActivity extends AppCompatActivity {

    public static final String EXTRA_INFO_TV_SHOW = "extra_info_tv_show";
    private ImageView imageviewTvShowImage;
    private TextView textviewTvShowTitle, textviewTvShowGenre, textviewTvShowRating,
            textviewTvShowOverview, textviewTvShowReleaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tv_show_detail);

        imageviewTvShowImage = findViewById(R.id.imageviewTvShowImage);
        textviewTvShowTitle = findViewById(R.id.textviewTvShowTitle);
        textviewTvShowGenre = findViewById(R.id.textviewTvShowGenre);
        textviewTvShowRating = findViewById(R.id.textviewTvShowRating);
        textviewTvShowOverview = findViewById(R.id.textviewTvShowOverview);
        textviewTvShowReleaseDate = findViewById(R.id.textviewTvShowReleaseDate);

        TvShowDetailViewModel tvShowDetailViewModel = ViewModelProviders.of(this).get(TvShowDetailViewModel.class);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int tvShowId = bundle.getInt(EXTRA_INFO_TV_SHOW);
            tvShowDetailViewModel.setTvShowId(tvShowId);
            TvShowDataModel tvShowDataModel = tvShowDetailViewModel.getTvShowDetail();
            if (tvShowDataModel != null) {
                setTvShowDetailRecyclerView(tvShowDetailViewModel.getTvShowDetail());
            }
        }
    }

    private void setTvShowDetailRecyclerView(TvShowDataModel tvShowDataModel) {

        GlideApp.with(this)
                .load(tvShowDataModel.getTvShowPosterPath())
                .into(imageviewTvShowImage);

        textviewTvShowTitle.setText(tvShowDataModel.getTvShowTitle());
        textviewTvShowGenre.setText(tvShowDataModel.getTvShowGenres());
        textviewTvShowOverview.setText(tvShowDataModel.getTvShowOverview());
        textviewTvShowReleaseDate.setText(tvShowDataModel.getTvShowReleaseDate());

        Double countRating = tvShowDataModel.getTvShowRating();
        String textRating = new DecimalFormat("##").format(countRating);
        textviewTvShowRating.setText(textRating + "%");

    }

}
