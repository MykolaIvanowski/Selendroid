package com.epam.lab.util;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.standalone.SelendroidConfiguration;
import io.selendroid.standalone.SelendroidLauncher;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class Driver {
    private static WebDriver driver;
    private static SelendroidLauncher launcher ;

    private Driver(){}

    public static WebDriver getDriver() {
        if(driver == null){

            SelendroidConfiguration config = new SelendroidConfiguration();
            launcher = new SelendroidLauncher(config);
            launcher.launchSelendroid();
            DesiredCapabilities caps = SelendroidCapabilities.android();
            try{
            driver = new SelendroidDriver(caps);
            }catch (Exception ex){
                ex.printStackTrace();
            }
        }
        return driver;
    }

    public static void setUrl(String startURL)  {
        getDriver().get(startURL);
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
    }

    public static   void stopDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
