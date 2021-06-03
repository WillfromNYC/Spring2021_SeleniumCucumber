package StepDefinition.Facebook;

import DriverWrapper.Web;
import Pages.Commands;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.mustache.Value;

import java.time.Duration;

public class MessengerSD extends Commands {

    Web web = new Web();

    By messengerlink = By.xpath("//a[@href='https://messenger.com/']");
    By loginButton = By.xpath("//button[@id='loginbutton']");
    By invalidUserPassText = By.xpath("//div[contains(text(),'Invalid username or password')]");

    @Given(value = "I am on facebook homepage")
    public void facebookLogin() {
        web.openUrl("https://www.facebook.com");
        Wait fWait = new FluentWait(Web.getDriver()) //Web not web because getDriver is static
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

    }
    @When(value = "I click messenger link")
    public void Messengerlink() {
        clickThis(messengerlink);
    }

    @And(value = "I Click on Log in")
    public void loginButton() {
        clickThis(loginButton);
    }
    @Then(value = "I Verify error message 'Incorrect email or phone number' is displayed")
    public void verifyErrorMessage() {
        getElement(invalidUserPassText);
        String errorMessage = getElementText(invalidUserPassText);
        Assert.assertEquals("Incorrect email or phone number", errorMessage);//assertEquals( message, expected, actual)
    }

}
