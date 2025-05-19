package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.DriverManger;

public class TextField {
WebDriver driver;
By locater;
    public TextField(By locater) {
        driver= DriverManger.getDriver();
        this.locater = locater;
    }
    public void Write(){
driver.findElement(locater).sendKeys();
    }
    public String getText(){
       return driver.findElement(locater).getText();
    }
}
