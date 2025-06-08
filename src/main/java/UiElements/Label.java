package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Label extends Elemenet {

    WebDriver driver;
    public Label(By locater) {
        super(locater);

    }

    public String getText(){
        return driver.findElement(locater).getText();
    }
}
