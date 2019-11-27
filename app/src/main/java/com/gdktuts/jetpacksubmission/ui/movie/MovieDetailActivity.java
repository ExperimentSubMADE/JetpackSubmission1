package com.gdktuts.jetpacksubmission.ui.movie;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.gdktuts.jetpacksubmission.R;
import com.gdktuts.jetpacksubmission.ui.movie.viewmodel.MovieDetailViewModel;
import com.gdktuts.jetpacksubmission.utils.GlideApp;

import java.text.DecimalFormat;

public class MovieDetailActivity extends AppCompatActivity {

    public static final String EXTRA_INFO_MOVIE = "extra_info_movie";
    private ImageView imageviewMovieImage;
    private TextView textviewMovieTitle, textviewMovieGenre, textviewMovieRating,
            textviewMovieOverview, textviewMovieReleaseDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        imageviewMovieImage = findViewById(R.id.imageviewMovieImage);
        textviewMovieTitle = findViewById(R.id.textviewMovieTitle);
        textviewMovieGenre = findViewById(R.id.textviewMovieGenre);
        textviewMovieRating = findViewById(R.id.textviewMovieRating);
        textviewMovieOverview = findViewById(R.id.textviewMovieOverview);
        textviewMovieReleaseDate = findViewById(R.id.textviewMovieReleaseDate);

        MovieDetailViewModel movieDetailViewModel = ViewModelProviders.of(this).get(MovieDetailViewModel.class);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            int movieId = bundle.getInt(EXTRA_INFO_MOVIE);
            movieDetailViewModel.setMovieId(movieId);
            MovieDataModel movieDataModel = movieDetailViewModel.getMovieDetail();
            if (movieDataModel != null) {
                setMovieDetailRecylerView(movieDetailViewModel.getMovieDetail());
            }
        }
    }

    private void setMovieDetailRecylerView(MovieDataModel movieDataModel) {

        GlideApp.with(this)
                .load(movieDataModel.getMoviePosterPath())
                .into(imageviewMovieImage);

        textviewMovieTitle.setText(movieDataModel.getMovieTitle());
        textviewMovieGenre.setText(movieDataModel.getMovieGenres());
        textviewMovieOverview.setText(movieDataModel.getMovieOverview());
        textviewMovieReleaseDate.setText(movieDataModel.getMovieReleaseDate());

        Double countRating = movieDataModel.getMovieRating();
        String textRating = new DecimalFormat("##").format(countRating);
        textviewMovieRating.setText(textRating + "%");

    }

}
