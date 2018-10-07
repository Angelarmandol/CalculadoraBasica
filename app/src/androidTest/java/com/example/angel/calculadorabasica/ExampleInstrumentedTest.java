package com.example.angel.calculadorabasica;

import com.example.angel.calculadorabasica.MainActivity;
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
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<MainActivity> mActivity = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testMulti(){

        onView(withId(R.id.numero1))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("5"))
                .check(ViewAssertions.matches(withText("5")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.numero2))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("3"))
                .check(ViewAssertions.matches(withText("3")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btn_Multi))
                .perform(ViewActions.click());

        onView(withId(R.id.resultado))
                .check(ViewAssertions.matches(withText("15")));


    }

    @Test
    public void testDivi(){

        onView(withId(R.id.numero1))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("7"))
                .check(ViewAssertions.matches(withText("7")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.numero2))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("2"))
                .check(ViewAssertions.matches(withText("2")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btn_Divi))
                .perform(ViewActions.click());

        onView(withId(R.id.resultado))
                .check(ViewAssertions.matches(withText("3.5")));


    }

    @Test
    public void testResta(){

        onView(withId(R.id.numero1))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("7"))
                .check(ViewAssertions.matches(withText("7")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.numero2))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("2"))
                .check(ViewAssertions.matches(withText("2")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btn_Resta))
                .perform(ViewActions.click());

        onView(withId(R.id.resultado))
                .check(ViewAssertions.matches(withText("5")));


    }
    @Test
    public void testSuma(){

        onView(withId(R.id.numero1))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("4"))
                .check(ViewAssertions.matches(withText("4")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.numero2))
                .perform(ViewActions.click())
                .perform(ViewActions.typeText("2"))
                .check(ViewAssertions.matches(withText("2")))
                .perform(ViewActions.closeSoftKeyboard());

        onView(withId(R.id.btn_Suma))
                .perform(ViewActions.click());

        onView(withId(R.id.resultado))
                .check(ViewAssertions.matches(withText("6")));


    }


}
