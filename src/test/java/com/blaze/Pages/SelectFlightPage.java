package com.blaze.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectFlightPage {

    WebDriver driver;

    By ChooseFlight = By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input");

    public void chooseFlight() {
        driver.findElement(ChooseFlight).click();
    }

    public SelectFlightPage(WebDriver driverFromPreviousClass) {
        this.driver = driverFromPreviousClass;
    }

}
