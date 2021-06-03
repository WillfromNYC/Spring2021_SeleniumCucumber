package Pages.Darksky;

import DriverWrapper.Web;
import Pages.Commands;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.sql.Driver;

public class Homepage extends Commands {
    By summaryLowTemp = By.xpath("//span[@class='low-temp-text']");
    By summaryHighTemp = By.xpath("//span[@class='high-temp-text']");

    //need scroll action: 1) scroll page 2) then find element

    public void scrollToToday() {
        JavascriptExecutor js = (JavascriptExecutor) Web.getDriver();
        js.executeScript("scrollBy(0,300)");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    public void findTodayClick() { //don't need arguments because will be supplying the locator in the method
        WebElement findToday = Web.getDriver().findElement((By.xpath("//a[@data-day='0']")));
        Web.getDriver().findElement(By.xpath("//a[@data-day='0']"));
        Web.getDriver().findElement(By.xpath("//a[@data-day='0']"));
    }


    //get scrolledToday low and high temp
    int scrollTodayLowTempInt = TempElementToInt(By.xpath("//a[@data-day='0']//span[@class='minTemp']"));
    int scrollTodayHighTempInt = TempElementToInt(By.xpath("//a[@data-day='0']//span[@class='maxTemp']"));

        //System.out.println("sL " + summaryLowTempInt + " sH " + summaryHighTempInt + " tL " + scrollTodayLowTempInt + " tH " + scrollTodayHighTempInt);


}
