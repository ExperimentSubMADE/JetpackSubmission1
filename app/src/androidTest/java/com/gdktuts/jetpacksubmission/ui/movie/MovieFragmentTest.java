package com.gdktuts.jetpacksubmission.ui.movie;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.test.espresso.UiController;
import androidx.test.espresso.ViewAction;
import androidx.test.espresso.contrib.RecyclerViewActions;
import androidx.test.rule.ActivityTestRule;
import androidx.viewpager.widget.ViewPager;

import com.gdktuts.jetpacksubmission.R;
import com.gdktuts.jetpacksubmission.testing.SingleFragmentActivity;
import com.gdktuts.jetpacksubmission.ui.utils.RecyclerViewItemCountAssertion;
import com.google.android.material.tabs.TabLayout;

import org.hamcrest.Matcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import java.util.Objects;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class MovieFragmentTest {

    @Rule
    public ActivityTestRule<SingleFragmentActivity> activityTestRule = new ActivityTestRule<>(SingleFragmentActivity.class);

    @Before
    public void checkViewPagerTest() {
        ViewPager viewPagerTest = activityTestRule.getActivity().findViewById(R.id.viewpagerMainNavigation);
        assertNotNull(viewPagerTest);
        assertEquals(2, Objects.requireNonNull(viewPagerTest.getAdapter()).getCount());
        assertEquals(-1, viewPagerTest.getAdapter().getItemPosition(new MovieFragment()));
        onView(withId(R.id.tablayoutMainNavigation)).check(matches(isDisplayed()));
        onView(withId(R.id.tablayoutMainNavigation)).perform(selectTabAtPositionTest(0)).check(matches(isDisplayed()));
    }

    @Test
    public void loadRecyclerViewMovieTest() {
        onView(withId(R.id.recylerviewMovieItem)).check(matches(isDisplayed()));
        onView(withId(R.id.recylerviewMovieItem)).check(new RecyclerViewItemCountAssertion(10));
    }

    @Test
    public void clickRecyclerViewMovieTest() {
        onView(withId(R.id.recylerviewMovieItem)).check(matches(isDisplayed()));
        onView(withId(R.id.recylerviewMovieItem)).perform(RecyclerViewActions.actionOnItemAtPosition(0, click()));
        onView(withId(R.id.relativelayoutMovieContentLayout)).check(matches(isDisplayed()));
    }

    @NonNull
    private static ViewAction selectTabAtPositionTest(final int position) {
        return new ViewAction() {
            @Override
            public Matcher<View> getConstraints() {
                return allOf(isDisplayed(), isAssignableFrom(TabLayout.class));
            }
            @Override
            public String getDescription() {
                return "Tab at index : " + position;
            }
            @Override
            public void perform(UiController uiController, View view) {
                if (view instanceof TabLayout) {
                    TabLayout tabLayoutTest = (TabLayout) view;
                    TabLayout.Tab tabTest = tabLayoutTest.getTabAt(position);

                    if (tabTest != null) {
                        tabTest.select();
                    }
                }
            }
        };
    }

}