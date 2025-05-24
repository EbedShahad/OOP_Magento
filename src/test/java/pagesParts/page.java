package pagesParts;

import UiElements.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.driverMangement;
public class page {
    By locater ;
    WebDriver driver;

    public page() {
        this.driver = driverMangement.getDriver("edge");
    }

TextBox pageHeader = new TextBox(By.cssSelector(".base"));
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    public String getTitle() {
        return driver.getTitle();
    }
}
