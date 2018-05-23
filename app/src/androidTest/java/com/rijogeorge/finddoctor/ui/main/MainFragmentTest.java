package com.rijogeorge.finddoctor.ui.main;

import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.rijogeorge.finddoctor.MainActivity;
import com.rijogeorge.finddoctor.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainFragmentTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void LoadView() {
        onView(withId(R.id.locationText))
                .check(matches(isDisplayed()));
        onView(withId(R.id.findButton))
                .check(matches(isDisplayed()));
    }

    @Test
    public void findButtonClick_correctIntent() {
        onView(withId(R.id.findButton))
                .perform(click());
        intended(toPackage("com.rijogeorge.finddoctor.ui.searchResult"));
    }
}