package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.LandingPage;
import com.cybertek.library.pages.LoginPage;
import com.cybertek.library.utilities.BrowserUtil;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Login_StepDefinitions {
    LoginPage object = new LoginPage();
    LandingPage landing = new LandingPage();


    @When("user enters {string} as username and {string} as password")
    public void user_enters_as_username_and_as_password(String username, String password) {
        object.username.sendKeys(username);
        object.password.sendKeys(password);
    }
    @When("User clicks on the login button")
    public void user_clicks_on_the_login_button() throws InterruptedException {
        object.submitButton.click();
        BrowserUtil.sleep(2);
    }

    @Then("there should be {int} of users there")
    public void there_should_be_of_users_there(Integer int1) {

        System.out.println("users count = " + landing.usersCount.getText());
        int expectedCount = int1;
        String actualUserCount = landing.usersCount.getText();
        String expectedUserCount = String.valueOf(expectedCount);
        Assert.assertTrue(actualUserCount.equals(expectedUserCount));

    }


    @When("user enters the student correct username")
    public void user_enters_the_student_correct_username() {
    object.username.sendKeys("student11@library");


    }
    @When("user enters the student correct password")
    public void user_enters_the_student_correct_password() {
        object.password.sendKeys("tScBPCUr");
    }
    @Then("user should login to the student home page")
    public void user_should_login_to_the_student_home_page() {

        object.submitButton.click();
    }

    @When("user enters the librarian correct username")
    public void user_enters_the_librarian_correct_username() {
object.username.sendKeys("librarian18@library");
    }
    @When("user enters the librarian correct password")
    public void user_enters_the_librarian_correct_password() {
        object.password.sendKeys("rKG2sP88");

    }
    @Then("user should login to the librarian home page")
    public void user_should_login_to_the_librarian_home_page() {
        object.submitButton.click();
    }

    @And("user clicks on the login button")
    public void userClicksOnTheLoginButton() {
        object.submitButton.click();
    }

    @When("user enters student username as {string}")
    public void userEntersStudentUsernameAs(String username) {
        object.username.sendKeys(username);
    }

    @And("user enters student password as {string}")
    public void userEntersStudentPasswordAs(String password) {
        object.password.sendKeys(password);
    }
    @Then("books should be displayed")
    public void booksShouldBeDisplayed() throws InterruptedException {
        System.out.println("books should be displayed");
        BrowserUtil.sleep(10);
        Assert.assertTrue(landing.booksTab.isDisplayed());
        Driver.closeDriver();

    }

    @When("user enters librarian username as {string}")
    public void userEntersLibrarianUsernameAs(String username) {
        object.username.sendKeys(username);
    }

    @And("user enters librarian password as {string}")
    public void userEntersLibrarianPasswordAs(String password) {
        object.password.sendKeys(password);
    }
    @Then("dashboard should be displayed")
    public void dashboardShouldBeDisplayed() throws InterruptedException {
        System.out.println("dashboard should be displayed");
        Driver.closeDriver();

    }

}
