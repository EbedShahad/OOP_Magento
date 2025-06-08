package pagesParts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utils.driverManger;

import static utils.driverManger.driver;

public class page {

 protected WebDriver driver;

    public page() {
        this.driver = driverManger.getDriver();
    }
 public    HeaderBar header = new HeaderBar();
    // ***
public boolean VerifyTheCurrentUrl(String url){
   return true;
}
    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }
    public String getWindowTitle() {
        return driver.getTitle();
    }
}
