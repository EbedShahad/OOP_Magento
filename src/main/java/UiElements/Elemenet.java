package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.driverManger;

public class Elemenet {
    //he use static keyword : First try without static
  public   WebDriver driver;
    public By locater;

    public Elemenet(By locater) {
        this.locater = locater;
        this.driver = driverManger.getDriver();
    }

    public boolean isDisplayed() {
        return driver.findElement(locater).isDisplayed();
    }
public  void hoverOn(){
        Actions action  = new Actions(driver);
        action.moveToElement(driver.findElement(locater)).perform();
}
}
