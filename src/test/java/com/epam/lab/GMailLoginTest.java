package com.epam.lab;
import com.epam.lab.bo.GMailLoginFacade;
import com.epam.lab.helper.Source;
import com.epam.lab.log.Log;
import com.epam.lab.model.User;
import com.epam.lab.util.Driver;
import io.selendroid.standalone.SelendroidLauncher;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class GMailLoginTest {

    private  WebDriver driver ;

     @BeforeClass
     public void start(){
         Log.logInfo("start before method");
         driver = Driver.getDriver();
         Driver.setUrl(Source.GMAIL_URL);
     }
    @AfterClass
    public void after(){
        Driver.stopDriver();
        Log.logInfo("finish test");
    }
    @Test
    public void loginGMailTest(){
        Log.logInfo("Start login test gmail");
        GMailLoginFacade loginPage = new GMailLoginFacade();

        loginPage.login(new User("mytest418@gmail.com","ytrewq4321" ));
        Assert.assertTrue(loginPage.getMenuLocator());
        Log.logInfo("success login test gmail");
    }
}
