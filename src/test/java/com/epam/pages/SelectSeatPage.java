package com.epam.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectSeatPage extends AbstractPage{

    private final String BASE_URL = "https://wizzair.com/";

    //можно //a[text()='Continue']
    @FindBy(xpath = "//form[@name='seat-selection']//a[text()='Continue']")
    private WebElement continueButton;

    //first row seats (6 elements)
    @FindBy(xpath = "//div[@class='seat-map__group__row seat-map__group__row--1']//input")
    private WebElement[] firstRowSeats;


    //all seats in the plane (180 elements)
    @FindBy(xpath = "//div[@class='booking-flow__seat-map__map seat-map seat-map--selected-" +
            "group-false booking-flow__seat-map__map--320 seat-map--320']//input")
    private WebElement[] allSeats;


    //all unavailable seats in the plane
    @FindBy(xpath = "//div[@class='booking-flow__seat-map__map seat-map seat-map--selected-group-false" +
            " booking-flow__seat-map__map--320 seat-map--320']//input[@disabled]")

    private WebElement[] unavailableSeats;

    public SelectSeatPage(WebDriver driver){
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    private WebElement[] getAllAvailableSeats(){
        WebElement[] availableSeats = null;
        //use disjoiont
        return availableSeats;
    }

    @Override
    public void openPage() {
        driver.navigate().to(BASE_URL);
    }


}
