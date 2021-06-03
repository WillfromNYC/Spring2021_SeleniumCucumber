package StepDefinition.Darksky;

import DriverWrapper.Web;
import Pages.Commands;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginSD {


    public void openDarksky() {
        Web web = new Web();
        web.openUrl("https://darksky.net");
    }


    public void summaryTemp() {
        Commands commands = new Commands();

        int summaryLowTempInt = commands.TempElementToInt(By.xpath("//span[@class='low-temp-text']"));
        int summaryHighTempInt = commands.TempElementToInt(By.xpath("//span[@class='high-temp-text']"));

        //need scroll action
        commands.scrollClickToTimeMachineToday(By.xpath("//a[@data-day='0']"), "scrollBy(0,300)");

        //get scrolledToday low and high temp
        int scrollTodayLowTempInt = commands.TempElementToInt(By.xpath("//a[@data-day='0']//span[@class='minTemp']"));
        int scrollTodayHighTempInt = commands.TempElementToInt(By.xpath("//a[@data-day='0']//span[@class='maxTemp']"));

        System.out.println("sL " + summaryLowTempInt + " sH " + summaryHighTempInt + " tL " + scrollTodayLowTempInt + " tH " + scrollTodayHighTempInt);
    }
        //compare all 3 results using previous methods

    /*public void compareTemp() {
        Commands commands = new Commands();
        commands.tempCompare(summaryTemp();summaryLowTempInt, scrollTodayLowTempInt);
        commands.tempCompare(summaryHighTempInt, scrollTodayHighTempInt);
        }*/


}








