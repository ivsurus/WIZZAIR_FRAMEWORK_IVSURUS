package com.epam.main;


import com.epam.driver.DriverSingleton;
import com.epam.pages.LoginPage;

public class Main {

    private final static String EMAIL = "tatester@12storage.com";
    private final static String PASSWORD = "qwerty12345";

    public static void main(String[] args) {

        LoginPage loginPage = new LoginPage(DriverSingleton.getDriver());
        loginPage.openPage();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        loginPage.login(EMAIL,PASSWORD);
    }
}
