package com.cybertek.library.step_definitions;

import com.cybertek.library.pages.SmartBearPage;
import com.cybertek.library.utilities.BrowserUtil;
import com.cybertek.library.utilities.ConfigurationReader;
import com.cybertek.library.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class SmartBear_StepDefinitions {

    SmartBearPage object = new SmartBearPage();
    @Given("User is logged into SmartBear Tester account and on Order page")
    public void user_is_logged_into_smart_bear_tester_account_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("smartBearUrl"));
    }
    @When("User enters {string} in the username field")
    public void user_enters_in_the_username_field(String username) {
    object.usernameBox.sendKeys(username);
    }
    @When("User enters {string} in the password field")
    public void user_enters_in_the_password_field(String password) {
    object.passwordBox.sendKeys(password);
    }
    @Then("User clicks on login button")
    public void user_clicks_on_login_button() {
        object.loginButton.click();
    }
    @When("User fills out the form as followed:")
    public void user_fills_out_the_form_as_followed() {
        object.orderForm.click();
    }
    @When("User selects {string} from product dropdown")
    public void user_selects_from_product_dropdown(String familyAlbum) {
        Select select =
        new Select(Driver.getDriver().findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));

        select.selectByValue(familyAlbum);
    }

    @When("User enters {string} to costumer name")
    public void user_enters_to_costumer_name(String name) {
        object.customerName.sendKeys(name);

    }
    @When("User enters {string} to street")
    public void user_enters_to_street(String street) {
        object.street.sendKeys(street);

    }
    @When("User enters {string} to city")
    public void user_enters_to_city(String city) {
        object.city.sendKeys(city);

    }
    @When("User enters {string} to state")
    public void user_enters_to_state(String state) {
        object.state.sendKeys(state);

    }
    @When("User enters {string} to zip code")
    public void user_enters_to_zip_code(String zipCode) {
        object.zipCode.sendKeys(zipCode);

    }
    @When("User selects {string} as card type")
    public void user_selects_as_card_type(String card) {
       object.visa.click();

    }
    @When("User enters {string} to card number")
    public void user_enters_to_card_number(String cardNumber) {
        object.cardNumber.sendKeys(cardNumber);

    }
    @When("User enters {string} to expiration date")
    public void user_enters_to_expiration_date(String expire) {
        object.expiry.sendKeys(expire);

    }
    @When("User clicks process button")
    public void user_clicks_process_button() throws InterruptedException {
        object.proceedButton.click();
        BrowserUtil.sleep(2);

    }
    @Then("User verifies {string} is in the list")
    public void user_verifies_is_in_the_list(String expectedName) {

        System.out.println("verification step");
        object.ordersList.click();
        String actualName = object.johnWickName.getText();
        Assert.assertEquals("Name verification Failed!",expectedName, actualName);

    }


    @And("User enters {string} to quantity")
    public void userEntersToQuantity(String number) {
        object.quantity.sendKeys(number);
    }
}
