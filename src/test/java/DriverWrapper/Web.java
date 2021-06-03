package DriverWrapper;

import Pages.Commands;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Web extends Commands {

    private static WebDriver driver = null; //create variables outside method to be able to call

    public void openurl() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Will\\Documents\\git\\Spring2021_SeleniumCucumber\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        Wait fWait = new FluentWait(Web.getDriver()) //Web not web because getDriver is static
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");

    }

    public void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_SeleniumCucumber\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        Wait fWait = new FluentWait(Web.getDriver()) //Web not web because getDriver is static
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class)
                .ignoring(NoAlertPresentException.class)
                .ignoring(StaleElementReferenceException.class)
                .withMessage("Element is not found within 30 seconds");


    }

    public void closepage() {
        driver.close();
    }

    public static WebDriver getDriver() {return driver;}
    Wait fWait = new FluentWait(Web.getDriver()) //Web not web because getDriver is static
            .withTimeout(Duration.ofSeconds(20))
            .pollingEvery(Duration.ofSeconds(1))
            .ignoring(NoSuchElementException.class)
            .ignoring(NoAlertPresentException.class)
            .ignoring(StaleElementReferenceException.class)
            .withMessage("Element is not found within 30 seconds");
    //May17 2:57:00

}
