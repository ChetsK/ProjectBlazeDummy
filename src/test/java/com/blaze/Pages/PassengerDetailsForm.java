package com.blaze.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PassengerDetailsForm {

    WebDriver driver;


    By InputName = By.id("inputName");
    By Address = By.id("address");
    By City = By.id("city");
    By State = By.id("state");
    By ZipCode = By.id("zipCode");
    By CrediCardNumber = By.id("creditCardNumber");
    By NameOnCard = By.id("nameOnCard");
    By SubmitBtn = By.xpath("/html/body/div[2]/form/div[11]/div/input");


    public void setName(String inputName) {
        driver.findElement(InputName).sendKeys(inputName);
    }

    public void setAddress(String address) {
        driver.findElement(Address).sendKeys(address);
    }

    public void setCity(String city) {
        driver.findElement(City).sendKeys(city);
    }

    public void setState(String state) {
        driver.findElement(State).sendKeys(state);
    }

    public void setZipCode(String zipCode) {
        driver.findElement(ZipCode).sendKeys(zipCode);
    }

    public void setCrediCardNumber(String crediCardNumber) {
        driver.findElement(CrediCardNumber).sendKeys(crediCardNumber);
    }

    public void setNameOnCard(String nameOnCard) {
        driver.findElement(NameOnCard).sendKeys(nameOnCard);
    }

    public void clickSubmitBtn() {
        driver.findElement(SubmitBtn).submit();
    }


    public PassengerDetailsForm(WebDriver driverFromPreviousClass) {
        this.driver = driverFromPreviousClass;
    }

}
