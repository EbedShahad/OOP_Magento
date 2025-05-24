package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.DriverManager;

import javax.swing.*;

public class Element {
    static WebDriver driver;
    By locater;

    public Element(By locater) {
        this.locater = locater;
        this.driver = DriverManager.getDriver();
    }
   public void hover()
   {
       Actions action = new Actions(this.driver);
       action.moveToElement(driver.findElement(locater)).perform();
   }
    public boolean isDisplayed() {
        return driver.findElement(locater).isDisplayed();
    }

}
