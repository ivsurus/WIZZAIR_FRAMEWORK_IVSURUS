package com.epam.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends AbstractPage{

    private final String BASE_URL = "https://wizzair.com/";

    @FindBy(id="search-departure-station")
    private WebElement inputOriginName;

    @FindBy(id ="search-arrival-station")
    private WebElement inputDestinationName;

    //кнопка search,  можно просто //button[text()="Search"]
    @FindBy(xpath = "//form[@name='flight-search']//button[text()='Search']")
    private WebElement searchButton;

    //кнопка sign in,
    @FindBy(xpath = "//ul[@class='navigation__container']/li[3]")
    //  @FindBy(xpath = "//form[@name='flight-search']//button[text()='Sign in']")
    private WebElement signInButton;

    //всплывающее окно регистрации поле email
    @FindBy(xpath = "//form[@name='login-form']//input[@type='email']")
    private WebElement emailField;

    //всплывающее окно регистрации поле password
    @FindBy(xpath = "//form[@name='login-form']//input[@type='password']")
    private WebElement passwordField;

    //кнопка submit Sign In
    @FindBy(xpath = "//form[@name='login-form']//button[@type='submit']")
    private WebElement submitSingInButton;

    //локатор содержащий текст ivan surus
    @FindBy(xpath = "//ul[@id='user-links']//a")
    private WebElement linkLoggedInUser;


    public MainPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }


    @Override
    public void openPage(){
        driver.navigate().to(BASE_URL);
    }


    public void login(String email, String password){
        signInButton.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
        submitSingInButton.click();
        /*System.out.println(signInButton.getText());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(signInButton.getText());*/
    }

    public String getLoggedInUserName()
    {
        return linkLoggedInUser.getText();
    }

}