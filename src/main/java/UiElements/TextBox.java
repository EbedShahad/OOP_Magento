package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextBox {
    By locater;
    WebDriver driver;
    public TextBox(By locater) {
        this.locater =locater;
    }

    public String getText(){
        return driver.findElement(locater).getText();
    }
}
