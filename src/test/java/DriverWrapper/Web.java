package DriverWrapper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

    private static WebDriver driver = null; //create variables outside method to be able to call

    public void openurl() {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Will\\Documents\\git\\Spring2021_SeleniumCucumber\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
    }

    public void openUrl(String url) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Will\\Documents\\git\\Spring2021_SeleniumCucumber\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
    }

    public void closepage() {
        driver.close();
    }

    public static WebDriver getDriver() {return driver;}
    //May17 2:57:00

}
