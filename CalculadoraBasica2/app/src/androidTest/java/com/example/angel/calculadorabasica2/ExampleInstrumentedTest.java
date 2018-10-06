package com.example.angel.calculadorabasica2;

import com.example.angel.calculadorabasica2.MainActivity;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;
import org.junit.runner.RunWith;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import org.junit.Rule;
import org.junit.Test;
import android.support.test.rule.ActivityTestRule;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleIntrumentedTest{

    @Rule
    public ActivityTestRule<MainActivity> mActivity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testSuma(){

        onView(withId(R.id.numero1))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("5"))
                .check(ViewAssertions.matches(withText("5")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.numero2)
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("3"))
                .check(ViewAssertions.matches(withText("3")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.buttonMulti)
                .perform(ViewActions.click());

        onView(withId(R.id.resultado))
                .check(ViewAssertions.matches(withText("15")));


    }


}