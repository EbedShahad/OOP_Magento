package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class waits {
    private static final int DEFAULT_TIMEOUT = 10;
    Actions action;
    WebDriverWait wait;
    WebDriver driver;

    public waits() {
       this.driver= driverMangement.getDriver("edge");
    }

    public WebElement waitForElementToBeVisible(By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public  WebElement waitForElementToBeClickable(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }
    public void elementToHover(WebDriver driver ,By locator) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        action.moveToElement(element).perform(); // Hover over the element
        action.pause(8000).perform(); // Pause for 8 seconds (this might be unnecessary for real tests)
    }
    //*************************************************************************
    public static boolean waitForElementInvisible(WebDriver driver, By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    //************************************************************************
    public static boolean waitForUrlContains(WebDriver driver, String partialUrl) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.urlContains(partialUrl));
    }
    public static boolean waitForTitleContains(WebDriver driver, String partialTitle) {
        return new WebDriverWait(driver, Duration.ofSeconds(DEFAULT_TIMEOUT))
                .until(ExpectedConditions.titleContains(partialTitle));
    }
}
