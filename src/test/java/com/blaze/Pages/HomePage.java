package com.blaze.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {


    WebDriver driver;

    @FindBy(xpath = "/html/body/div[3]/form/select[1]")
            private WebElement fromPort;

    @FindBy(xpath = "/html/body/div[3]/form/select[2]")
    private WebElement toPort;

    @FindBy(xpath ="/html/body/div[3]/form/div/input")
            private WebElement FindFlights;


    public void setDestFrom()
    {
        Select deptCity = new Select(fromPort);
        deptCity.selectByVisibleText("Boston");
    }

    public void setTODestination()
    {
        Select destCity = new Select(toPort);
        destCity.selectByVisibleText("London");
    }


    public void findFlight() {
        FindFlights.submit();
    }


    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


}
