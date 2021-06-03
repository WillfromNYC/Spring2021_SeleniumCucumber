package Pages.Facebook;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import java.time.Duration;

public class Messenger extends Commands {
    Web web = new Web();

    By messengerlink = By.xpath("//a[@href='https://messenger.com/']");
    By loginButton = By.xpath("//button[@id='loginbutton']");
    By invalidUserPassText = By.xpath("//div[contains(text(),'Invalid username or password')]");

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

    public void Messengerlink() {
        clickThis(messengerlink);
    }

    public void loginButton() {
        clickThis(loginButton);
    }

    public void invalidUserPassText() {
        getElement(invalidUserPassText);
    }

    public void verifyErrorMessage() {
        String errorMessage = getElementText(invalidUserPassText);
        Assert.assertEquals("Incorrect email or phone number", errorMessage);//assertEquals( message, expected, actual)

    }







}
