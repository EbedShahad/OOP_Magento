package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends Elemenet {
WebDriver driver;
    By locater;
    public Button(By locater,WebDriver driver) {
        super(locater,driver);

    }
    public void click() {
        driver.findElement(locater).click();
    }
    public boolean isEnabled() {
         return driver.findElement(locater).isEnabled();

    }
}
