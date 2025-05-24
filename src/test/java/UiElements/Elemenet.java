package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driverMangement;

public class Elemenet {
    WebDriver driver;
    By locater;

    public Elemenet(By locater,WebDriver driver) {
        this.locater = locater;
        this.driver = driverMangement.getDriver("edge");
    }

    public boolean isDisplayed() {
        return driver.findElement(locater).isDisplayed();
    }

}
