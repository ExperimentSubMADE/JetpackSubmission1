package com.gdktuts.jetpacksubmission.ui.movie;

import android.content.Context;
import android.content.Intent;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;

import com.gdktuts.jetpacksubmission.R;
import com.gdktuts.jetpacksubmission.ui.utils.FakeContentDataDummy;

import org.junit.Rule;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public class MovieDetailActivityTest {

    private MovieDataModel movieDataModelTest = FakeContentDataDummy.movieDataDummies().get(0);

    @Rule
    public ActivityTestRule<MovieDetailActivity> activityTestRule = new ActivityTestRule<MovieDetailActivity>
            (MovieDetailActivity.class) {

        @Override
        protected Intent getActivityIntent() {

            Context contextTargetTest = InstrumentationRegistry.getInstrumentation().getTargetContext();
            Intent intentTest = new Intent(contextTargetTest, MovieDetailActivity.class);
            intentTest.putExtra(MovieDetailActivity.EXTRA_INFO_MOVIE, movieDataModelTest.getMovieId());
            return intentTest;
        }
    };

    @Test
    public void loacContentMovieTest() {

        onView(withId(R.id.imageviewMovieImage)).check(matches(isDisplayed()));

        onView(withId(R.id.textviewMovieTitle)).check(matches(isDisplayed()));
        onView(withId(R.id.textviewMovieTitle)).check(matches(withText(movieDataModelTest.getMovieTitle())));

        onView(withId(R.id.textviewMovieGenre)).check(matches(isDisplayed()));
        onView(withId(R.id.textviewMovieGenre)).check(matches(withText(movieDataModelTest.getMovieGenres())));

        onView(withId(R.id.textviewMovieReleaseDate)).check(matches(isDisplayed()));
        onView(withId(R.id.textviewMovieReleaseDate)).check(matches(withText(movieDataModelTest.getMovieReleaseDate())));

        onView(withId(R.id.textviewMovieOverview)).check(matches(isDisplayed()));
        onView(withId(R.id.textviewMovieOverview)).check(matches(withText(movieDataModelTest.getMovieOverview())));

        onView(withId(R.id.textviewMovieRating)).check(matches(isDisplayed()));
    }

}