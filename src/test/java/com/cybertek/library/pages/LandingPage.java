package com.cybertek.library.pages;

import com.cybertek.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LandingPage {
    public LandingPage(){
        PageFactory.initElements(Driver.getDriver(), this);


    }
    @FindBy(id = "user_count")
    public WebElement usersCount;

    @FindBy(xpath = "(//span[@class='title'])[1]")
    public WebElement booksTab;

    @FindBy(linkText = "Users")
    public WebElement usersLink;

    @FindBy(linkText = "Books")
    public WebElement booksLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy(xpath = "//select[@class='form-control input-sm input-xsmall input-inline']")
    public WebElement showRecordsDropDown;

    @FindBy(xpath ="//table//th" )
    public List<WebElement> columnsList;
    @FindBy(xpath = "//ul[@class='navbar-nav  navbar-right']")
    public WebElement usernameBox;
}
