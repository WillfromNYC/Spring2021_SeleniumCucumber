package Pages.Facebook;

import DriverWrapper.Web;
import Pages.Commands;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CreateAccountPage extends Commands  {

    Web web = new Web();


    public void openFacebook() {
        web.openUrl("https://www.facebook.com");
    }

    //By locators
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


    public void createAcct() {
        clickThis(byCreateAcct);
    }

    public void clickCreateAccount() {
        WebElement webCreateAcct = Web.getDriver().findElement(By.xpath("//a[text()='Create New Account']"));
        webCreateAcct.click();


        WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 20);

        ;/* eWait.until(ExpectedConditions.titleIs("Facebook"));


        eWait.until(ExpectedConditions.and(
                ExpectedConditions.alertIsPresent(),
                ExpectedConditions.titleContains("Facebook")
                )
        );

        eWait.until(ExpectedConditions.or(
                ExpectedConditions.alertIsPresent(),
                ExpectedConditions.titleContains("Facebook")
                )
        )*/
    }

    public void firstNameType() {
       type(byFName,"First");
    }

    public void lastNameType() {
        type(bylName,"Last");
    }

    public void emailPhoneType() {
        type(byEmailPhone,"9898787800");
    }

    public void passwordType() {
        type(byPass,"myemail@gmail.com");
    }

    public void monthSelect() {
        selectFromDropdown(byMonth,"Jun");
    }

    public void daySelect() {
        selectFromDropdown(byDay,"5");
    }

    public void yearSelect() {
        selectFromDropdown(byYear,"2000");
    }

    public void isSexButtonSelected(){
        List<WebElement> sexButtonSelected = getElements(By.xpath("//input[@value='1']"));
        getElements(By.xpath("//input[@value='2']"));
        getElements(By.xpath("//input[@value='-1']"));

        for (WebElement sexButton : sexButtonSelected) {
            boolean isSexButtonSelected = sexButton.isSelected();
            System.out.println("is any of the radio buttons selected:" + isSexButtonSelected);
        }

    }



    //old code
    /*String passString = "myemail@gmail.com";
    By byPass = By.id("password_step_input");
    WebElement webPass = driver.findElement(byPass);
        webPass.sendKeys(passString);*/
    //for submit button
   /* By bySignup = By.name("websubmit");
    WebElement webSignup = driver.findElement(bySignup);
        webSignup.click();

    //auto suggestion with for loop
    By autoSuggestionLocator = By.xpath("//*[contains(@class,'in-viewport-root')]//span[not(@class) or @class='autosuggest-category-result']");
    List<WebElement> allSuggestions = driver.findElements(autoSuggestionLocator);

    String optionToSelect = "manhattan, New York, New York, United States of America";

        for (WebElement suggestionElement : allSuggestions) {
        String suggestion = suggestionElement.getText();
        System.out.println(suggestion);
        if (suggestion.equalsIgnoreCase(optionToSelect)) {
            suggestionElement.click();
            break;
        }

    }*/

    /*boolean isMaleButtonSelected = maleRadio.isSelected();
        System.out.println("is Male radio button selected: " + isMaleButtonSelected);*/


    //Create action to click create Account button









}
