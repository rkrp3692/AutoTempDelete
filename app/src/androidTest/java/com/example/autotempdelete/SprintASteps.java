package com.example.autotempdelete;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

import androidx.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SprintASteps {

    @Rule
//    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<>(MainActivity.class);
    public ActivityTestRule<MainActivity> activityScenarioRule = new ActivityTestRule<>(MainActivity.class);


    @Test
    @Given("Test1")
    public void Test1Method()
    {
        onView(withText("Hello World!")).check(matches(isDisplayed()));
    }

//    @When("Test2")
//    public void Test2Method()
//    {
//
//    }
//
//    @Then("Test3")
//    public void Test3Method()
//    {
//
//    }

}
