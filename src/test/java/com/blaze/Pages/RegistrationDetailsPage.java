package com.blaze.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class RegistrationDetailsPage {

    WebDriver driver;
    By TableRow = By.xpath("/html/body/div[2]/div/table/tbody/tr[1]");

    public String getTestfromTableRow() {
        String rowtext  =  driver.findElement(TableRow).getText();
        return rowtext;
    }

    public RegistrationDetailsPage(WebDriver driverFromPreviousClass) {
        this.driver = driverFromPreviousClass;
    }


}
