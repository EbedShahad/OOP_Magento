package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager {
    public static WebDriver driver;
   static  String browser="chrome";
    public static   WebDriver getDriver(){
        if (driver == null) {
            switch (browser.toLowerCase()) {
                case "chrome":
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    driver = new EdgeDriver();
                    break;
                default:
                    System.out.println("Unsupported browser: " + browser);
            }
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
