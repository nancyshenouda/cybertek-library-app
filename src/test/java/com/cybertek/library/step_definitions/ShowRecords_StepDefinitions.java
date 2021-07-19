package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class ShowRecords_StepDefinitions {

    LandingPage landing = new LandingPage();
   Select select;


    @And("user clicks on {string} link in the landing page")
    public void userClicksOnLinkInTheLandingPage(String usersLink) {
        landing.usersLink.click();
    }

    @Then("Show records dropdown value should be {int} by default")
    public void showRecordsDropdownValueShouldBeByDefault(int expected) {
        select =  new Select(landing.showRecordsDropDown);
        String actualNumberString = select.getFirstSelectedOption().getText();
        //int actualNumber = Integer.parseInt(actualNumberString);
        Assert.assertEquals(expected+"", actualNumberString);
    }

    @And("show records should have following options:")
    public void showRecordsShouldHaveFollowingOptions(List<String> options) {
        select = new Select(landing.showRecordsDropDown);
        List<WebElement> list = select.getOptions();

        List<String> webElementsText = new ArrayList<>();
        for(WebElement each : list){
            webElementsText.add(each.getText());

        }
        Assert.assertEquals(options, webElementsText);
    }

    @Given("user is on the login page")
    public void userIsOnTheLoginPage() {

        Driver.getDriver().get("http://library2.cybertekschool.com/");
    }
}
