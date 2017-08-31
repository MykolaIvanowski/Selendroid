package com.epam.lab.bo;

import com.epam.lab.model.User;
import com.epam.lab.pageobject.Login;

public class GMailLoginFacade {
    Login loginPage = new Login();

    public void login(User user)  {
        typeLoginAndSubmit(user.getLogin());
        typePasswordAndSubmit(user.getPassword());
    }

    public boolean getMenuLocator() {

        return  loginPage.getMenu().isEnabled();
    }

    public void typeLoginAndSubmit(String login) {
        loginPage.getLogin().sendKeys(login);
        loginPage.getLoginNext().click();
    }

    public void typePasswordAndSubmit(String password) {
        loginPage.getPassword().sendKeys(password);
        loginPage.getButtonNext().click();
    }
}
