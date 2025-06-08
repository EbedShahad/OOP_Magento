package UiElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.driverManger;

public class TextField {
WebDriver driver;
By locater;
    public TextField(By locater) {
        driver= driverManger.getDriver();
        this.locater = locater;
    }
    public void Write(String sent){
driver.findElement(locater).sendKeys(sent);
    }
    public String getText(){
       return driver.findElement(locater).getText();
    }
    public  String checkRequired(WebElement field){
        return field.getAttribute("aria-required");
    }
}
