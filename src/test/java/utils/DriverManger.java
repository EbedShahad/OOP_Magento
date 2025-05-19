package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverManger {
    private static WebDriver driver;
    public static WebDriver getDriver(){
        if (driver == null) {
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }
        return driver;

    }
    public static void quitDriver(){
        driver.manage().window().minimize();
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
