package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Button extends Element {

    public Button(By locater ) {
        super(locater);

    }
    public void click() {
        driver.findElement(locater).click();
    }
    public boolean isEnabled() {
         return driver.findElement(locater).isEnabled();

    }
}
