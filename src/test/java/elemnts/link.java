package elemnts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import utils.DriverManger;

public class link {
    WebDriver driver;
    By locater;
    Actions actions ;
    public link(By locater) {
        this.locater = locater;
        driver= DriverManger.getDriver();
        this.actions = new Actions(driver);
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
    public void hoverOneElment(){
        actions.moveToElement(driver.findElement(locater)).perform();

    }
}
