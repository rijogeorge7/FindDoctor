package com.rijogeorge.finddoctor.ui.main;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.rijogeorge.finddoctor.R;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasShortClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtra;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainFragmentTest {

    @Rule
    public IntentsTestRule<MainActivity> mActivityRule = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void LoadView() {
        onView(withId(R.id.locationText))
                .check(matches(isDisplayed()));
        onView(withId(R.id.findButton))
                .check(matches(isDisplayed()));
    }

    @Test
    public void findButtonClick_correctIntent() {
        String location = "Tracy ca";
        onView(withId(R.id.locationText))
                .perform(clearText(), typeText(location), closeSoftKeyboard());

        onView(withId(R.id.findButton))
                .perform(click());

        intended(allOf(
                hasComponent(hasShortClassName(".ui.searchResult.DoctorSearchListActivity")),
                toPackage("com.rijogeorge.finddoctor"),
                hasExtra(MainFragment.locationString, location)));
    }
}