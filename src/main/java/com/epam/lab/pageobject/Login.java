package com.epam.lab.pageobject;

import com.epam.lab.util.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {

    @FindBy(name = "Email")
    private WebElement login;

    @FindBy(id = "next")
    private WebElement LoginNext;

    @FindBy(name = "Passwd")
    private WebElement password;

    @FindBy(id = "signIn")
    private WebElement buttonNext;

    @FindBy(id = "og_a")
    private WebElement menu;


    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public WebElement getLogin() {
        return login;
    }

    public WebElement getLoginNext() {
        return LoginNext;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getButtonNext() {
        return buttonNext;
    }

    public WebElement getMenu() {
        return menu;
    }

}
