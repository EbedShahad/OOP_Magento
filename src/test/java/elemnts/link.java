package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.DriverManger;

public class link {
    WebDriver driver;
    By locater;

    public link(By locater) {
        this.locater = locater;
        driver= DriverManger.getDriver();
    }

    public void click(){
driver.findElement(locater).click();
    }
    public String getText(){
        return driver.findElement(locater).getText();
    }
    public String getUrl(){
       return driver.findElement(locater).getAttribute("href");
    }
    public boolean isVisible(){
        return  driver.findElement(locater).isDisplayed();
    }
}
