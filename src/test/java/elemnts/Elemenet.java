package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManger;

public class Elemenet {
    WebDriver driver;
    By locater;

    public Elemenet(By locater) {
        this.locater = locater;
        this.driver = DriverManger.getDriver();
    }

    public boolean isDisplayed() {
        return driver.findElement(locater).isDisplayed();
    }

}
