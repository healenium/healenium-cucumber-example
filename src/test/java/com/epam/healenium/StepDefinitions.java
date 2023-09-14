package com.epam.healenium;


import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class StepDefinitions {

    public static WebDriver driver;

    @BeforeAll
    public static void init() throws MalformedURLException {
        ChromeOptions options = new ChromeOptions();
        driver = new RemoteWebDriver(new URL("http://localhost:8085"), options);
    }

    @Given("User opens the web page {string}")
    public void user_opens_the_web_page(String url) {
        driver.get(url);
    }

    @When("Find element by xpath {string}")
    public void findElementByXpath(String xpath) {
      driver.findElement(By.xpath(xpath));
    }

    @And("Update firm attributes and click the button with id {string}")
    public void updateFirmAttributesAndClickTheButtonWithId(String id) {
        driver.findElement(By.id(id)).click();
    }

    @Then("User can find the field with xpath {string} anyway after submitting the form")
    public void userCanFindTheFieldWithXpathAnywayAfterSubmittingTheForm(String xpath) {
        // Should be healing
        driver.findElement(By.xpath(xpath)).isEnabled();
    }

    @AfterAll
    public static void destroy() {
        driver.quit();
    }
}
