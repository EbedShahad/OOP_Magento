package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driverMangement;

public class TextField {
WebDriver driver;
By locater;
    public TextField(By locater) {
        driver= driverMangement.getDriver("edge");
        this.locater = locater;
    }
    public void Write(){
driver.findElement(locater).sendKeys();
    }
    public String getText(){
       return driver.findElement(locater).getText();
    }
    public  String checkRequired(WebElement field){
        return field.getAttribute("aria-required");
    }
}
