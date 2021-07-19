package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchResults_StepDefinitions {
LandingPage landing = new LandingPage();

   
    @Then("table should have following columns:")
    public void table_should_have_following_columns(List<String> expected) {

        List<String> list = new ArrayList<>();
        for(WebElement each : landing.columnsList){
            list.add(each.getText());
        }
        Assert.assertEquals(expected, list);




    }

}
