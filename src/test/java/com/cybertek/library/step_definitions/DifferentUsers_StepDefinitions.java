package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import com.cybertek.library.utilities.BrowserUtil;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class DifferentUsers_StepDefinitions {
    LandingPage landing = new LandingPage();
    @When("user should be able to see {string} in the account username section.")
    public void user_should_be_able_to_see_in_the_account_name_section(String expectedUsername) throws InterruptedException {
        BrowserUtil.sleep(2);
        String actualUsername = landing.usernameBox.getText();

            Assert.assertEquals(expectedUsername, actualUsername );

        Driver.closeDriver();
        }




    }


