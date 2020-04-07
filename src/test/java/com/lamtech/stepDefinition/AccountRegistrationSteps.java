package com.lamtech.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AccountRegistrationSteps {
    WebDriver driver;

    @Given("^User on create an account page$")
    public void userOnCreateAnAccountPage() {

        // To define chrome driver
        WebDriverManager.chromedriver().setup();

        // To open chrome driver
        driver = new ChromeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        //To Launch Luma Ecommerce Website
        driver.get("http://demo-magento2.vuestorefront.io/");

        // Click create an account
        driver.findElement(By.linkText("Create an Account")).click();

    }

    @When("^User enters first name$")
    public void userEntersFirstName() {

        driver.findElement(By.id("firstname")).sendKeys("kay");


    }

    @And("^User enters last name$")
    public void userEntersLastName() {

        driver.findElement(By.id("lastname")).sendKeys("cee");
    }


    @And("^User enters email address$")
    public void userEntersEmailAddress() {

        driver.findElement(By.id("email_address")).sendKeys("louis221@yahoo.com");
    }


    @And("^User enters password$")
    public void userEntersPassword() {

        driver.findElement(By.id("password")).sendKeys("Yemi2020");
    }

    @And("^User enters confirm password$")
    public void userEntersConfirmPassword() {

        driver.findElement(By.id("password-confirmation")).sendKeys("Yemi2020");
    }

    @And("^User clicks on create account$")
    public void userClicksOnCreateAccount() {

        driver.findElement(By.cssSelector("#form-validate > div > div.primary > button")).click();
    }

    @Then("^account should be created successfully$")
    public void accountShouldBeCreatedSuccessfully() {


    }

















    }
