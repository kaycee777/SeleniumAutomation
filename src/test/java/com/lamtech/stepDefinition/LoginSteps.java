package com.lamtech.stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginSteps {
    WebDriver driver;

    @Given("^User on log in page$")
    public void userOnLogInPage() {
        WebDriverManager.chromedriver().setup();

        // To open chrome driver
        driver = new ChromeDriver();

        // To maximize browser
        driver.manage().window().maximize();

        //To Launch Luma Ecommerce Website
        driver.get("http://demo-magento2.vuestorefront.io/");

        // To sign in
        driver.findElement(By.linkText("Sign In")).click();
    }

    @When("^User their enters email Address$")
    public void userTheirEntersEmailAddress() {

        driver.findElement(By.id("email")).sendKeys("louis221@yahoo.com");
    }

    @And("^User their enters password$")
    public void userTheirEntersPassword() {

        driver.findElement(By.id("pass")).sendKeys("Yemi2020");
    }

    @And("^User clicks on log in$")
    public void userClicksOnLogIn() {
        driver.findElement(By.xpath("//*[@id=\"send2\"]/span")).click();
    }

    @Then("^my account dashboard is displayed$")
    public void myAccountDashboardIsDisplayed() {
        driver.close();
    }
}
