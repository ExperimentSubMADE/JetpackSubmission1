package com.gdktuts.jetpacksubmission.ui.movie;


import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gdktuts.jetpacksubmission.R;
import com.gdktuts.jetpacksubmission.ui.movie.viewmodel.MovieViewModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class MovieFragment extends Fragment {

    private RecyclerView recyclerviewMovieItem;
    private MovieAdapter movieAdapter;
    private ArrayList<MovieDataModel> movieDataModelArrayList = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_movie, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerviewMovieItem = view.findViewById(R.id.recylerviewMovieItem);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null) {
            MovieViewModel movieViewModel = ViewModelProviders.of(this).get(MovieViewModel.class);
            movieAdapter = new MovieAdapter(movieDataModelArrayList, getActivity(), movieClickCallback);
            setRecyclerView(movieViewModel.getMovies());
        }
    }

    private MovieClickCallback movieClickCallback = movieDataModel -> {
        Intent intent = new Intent(getActivity(), MovieDetailActivity.class);
        intent.putExtra(MovieDetailActivity.EXTRA_INFO_MOVIE, movieDataModel.getMovieId());
        startActivity(intent);
    };

    private void setRecyclerView(ArrayList<MovieDataModel> moviesContent) {
        movieAdapter.setMovieDataModels(moviesContent);
        recyclerviewMovieItem.setLayoutManager(new GridLayoutManager(getActivity(), 2));
        recyclerviewMovieItem.setHasFixedSize(true);
        recyclerviewMovieItem.setAdapter(movieAdapter);
    }

}
