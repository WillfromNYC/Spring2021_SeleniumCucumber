package StepDefinition.Facebook;

import DriverWrapper.Web;
import Pages.Commands;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CreateAcctSD extends Commands{
    Web web = new Web();

    By byCreateAcct = By.xpath("//a[text()='Create New Account']");
    By byFName = By.xpath("//input[@name='firstname']");
    By bylName = By.xpath("//input[@name='lastname']");
    By byEmailPhone = By.xpath("//input[@aria-label='Mobile number or email']");
    By byPass = By.xpath("//input[@data-type='password']");
    By byMonth = By.xpath("//select[@name='birthday_month']");
    //By byMonthJun = By.xpath("//select[@name='birthday_month']//option[text()='Jun']");
    By byDay = By.xpath("//select[@name='birthday_day']");
    By byYear = By.xpath("//select[@name='birthday_year']");
    By femaleRadio = By.xpath("//input[@value='1']");
    By maleRadio = By.xpath("//input[@value='2']");
    By customRadio = By.xpath("//input[@value='-1']");




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


    @When(value = "click create account")
    public void clickCreateAccount() {
            WebElement webCreateAcct = Web.getDriver().findElement(By.xpath("//a[text()='Create New Account']"));
            webCreateAcct.click();
        Web.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        /*Wait fWait = new FluentWait(Web.getDriver()) //Web not web because getDriver is static
                .withTimeout(Duration.ofSeconds(15))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");*/
        }

    @And(value = "I fill out the first name")
    public void firstNameType() {
            type(byFName, "First");
        Web.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }

    @And(value = "I fill out the last name")
    public void lastNameType() {
            type(bylName, "Last");
        }

    @And(value = "I fill username/email")
    public void emailPhoneType() {
            type(byEmailPhone, "9898787800");
        }

    @And(value = "I fill out password")
    public void passwordType() {
            type(byPass, "myemail@gmail.com");
        }
    @And(value = "I select the month")
    public void monthSelect() {
            selectFromDropdown(byMonth, "Jun");
        }
    @And(value = "I select the day")
    public void daySelect() {
            selectFromDropdown(byDay, "5");
        }
    @And(value = "I select the year")
    public void yearSelect() {
            selectFromDropdown(byYear, "2000");
        }
    @Then(value = "I verify sex button radio is selected or not")
    public void isSexButtonSelected() {
        List<WebElement> sexButtonSelected = getElements(By.xpath("//input[@value='1']"));
        getElements(By.xpath("//input[@value='2']"));
        getElements(By.xpath("//input[@value='-1']"));

        for (WebElement sexButton : sexButtonSelected) {
                boolean isSexButtonSelected = sexButton.isSelected();
                System.out.println("is any of the radio buttons selected:" + isSexButtonSelected);
        }
        WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 20);

    }





}
