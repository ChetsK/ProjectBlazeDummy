package com.blaze.TestScripts;

import com.blaze.Pages.HomePage;
import com.blaze.Pages.PassengerDetailsForm;
import com.blaze.Pages.RegistrationDetailsPage;
import com.blaze.Pages.SelectFlightPage;
import org.apache.log.Priority;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TS01_BookFlight {


    static final WebDriver driver = new ChromeDriver();

    @BeforeTest
    public void SetDriver() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        driver.manage().window().maximize();
        String URL = "https://blazedemo.com/";
        driver.get(URL);
        Thread.sleep(2000L);

    }

    @Test(priority = 0)
    public void sanityTest(){
        HomePage homePage = new HomePage(driver);
        String ActualTitle = driver.getTitle();
        String ExpectedTitle = "BlazeDemo";
        Assert.assertEquals(ExpectedTitle, ActualTitle, "SANITY TEST PASSED");

    }

    @Test(dependsOnMethods= "sanityTest", alwaysRun=true)
    public void bookFlight()
    {

        HomePage homePage = new HomePage(driver);
        SelectFlightPage selectFlightPage = new SelectFlightPage(driver);
        PassengerDetailsForm passengerDetailsForm = new PassengerDetailsForm(driver);
        RegistrationDetailsPage registrationDetailsPage = new RegistrationDetailsPage(driver);

        homePage.setDestFrom();
        homePage.setTODestination();
        homePage.findFlight();
        selectFlightPage.chooseFlight();
        passengerDetailsForm.setName("Chets");
        passengerDetailsForm.setAddress("123 Boston");
        passengerDetailsForm.setCity("Bangalore");
        passengerDetailsForm.setState("Karnatka");
        passengerDetailsForm.setZipCode("55403");
        passengerDetailsForm.setCrediCardNumber("1234556778");
        passengerDetailsForm.setNameOnCard("Chetanak");
        passengerDetailsForm.clickSubmitBtn();
        String rowTextRegId = registrationDetailsPage.getTestfromTableRow();
        Assert.assertTrue(rowTextRegId.contains("Id 162"), "FLIGHT BOOKED TEST CASE PASS");

    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

}
