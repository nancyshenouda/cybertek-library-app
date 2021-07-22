package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBearPage {

    public SmartBearPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id = "ctl00_MainContent_username")
    public WebElement usernameBox;

    @FindBy(id = "ctl00_MainContent_password")
    public WebElement passwordBox;

    @FindBy(id = "ctl00_MainContent_login_button")
    public WebElement loginButton;

    @FindBy(linkText = "Order")
    public WebElement orderForm;



    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    public WebElement quantity;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    public WebElement unitPrice;

    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    public WebElement customerName;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    public WebElement street;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    public WebElement city;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    public WebElement state;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    public WebElement zipCode;

    @FindBy(xpath = "//input[@value='Visa']")
    public WebElement visa;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    public WebElement cardNumber;

    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    public WebElement expiry;

    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    public WebElement proceedButton;

    @FindBy(linkText = "View all orders")
    public WebElement ordersList;

    @FindBy(xpath = "//tbody//tr//td[.='John Wick']")
    public WebElement johnWickName;
}
