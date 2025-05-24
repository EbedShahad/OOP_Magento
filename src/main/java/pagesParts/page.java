package pagesParts;

import org.openqa.selenium.WebDriver;

import utils.DriverManager;

public class page {
//    By locater ;
    protected WebDriver driver;

    public page() {
        this.driver = DriverManager.getDriver();
    }

    HeaderBar header = new HeaderBar();
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    public String getWindowTitle() {
        return driver.getTitle();
    }
}
