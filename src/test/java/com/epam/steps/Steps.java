package com.epam.steps;

import com.epam.pages.MainPage;
import org.openqa.selenium.WebDriver;
import com.epam.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Steps {

    private WebDriver driver;
    private final Logger logger = LogManager.getRootLogger();

    public void initBrowser()
    {
        driver = DriverSingleton.getDriver();
    }

    public void closeDriver()
    {
        driver.quit();
    }

    public void loginWizzAir(String email, String password)
    {
        MainPage mainPage = new MainPage(driver);
        mainPage.openPage();
        mainPage.login(email, password);
    }

    /*public boolean isLoggedIn(String username)
    {
        MainPage mainPage = new MainPage(driver);
        return (mainPage.getLoggedInUserName().trim().equalsIgnoreCase(username));
    }*/

}
