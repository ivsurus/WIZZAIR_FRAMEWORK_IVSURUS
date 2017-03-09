package com.epam.driver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.util.concurrent.TimeUnit;


public class DriverSingleton {

    private static WebDriver driver;
    private static final Logger logger = LogManager.getRootLogger();
    private static final String WEBDRIVER_GECKO_DRIVER = "webdriver.gecko.driver";
    private static final String GECKODRIVER_GECKODRIVER_EXE_PATH = "C:\\Users\\Ivan\\Downloads\\geckodriver-v0.12.0-win64\\geckodriver.exe";
//    private static final String GEOLOCATION_PATH = "file:///D:/Сурус/JAVA/WIZZAIR_FRAMEWORK_IVSURUS/src/main/resources/geoLocation.json";

    private DriverSingleton(){}


    public static WebDriver getDriver(){
        if (null == driver){

            /*FirefoxProfile profile = new FirefoxProfile();
            profile.setPreference("geo.enabled", true);
            profile.setPreference("geo.provider.use_corelocation", true);
            profile.setPreference("geo.wifi.uri", GEOLOCATION_PATH);*/
            System.setProperty(WEBDRIVER_GECKO_DRIVER, GECKODRIVER_GECKODRIVER_EXE_PATH);
            driver = new FirefoxDriver();
            driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            logger.info("Browser started");
        }

        return driver;
    }

    public static void closeDriver(){
        driver.quit();
        driver = null;
    }
}
