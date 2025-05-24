package pagesParts;

import UiElements.link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import utils.waits;

public class mainMenu {
    // each tab is a clickable Tab, two actions can happen : 1.hover on 2. click on it
    WebDriver driver = new FirefoxDriver();
    Actions action = new Actions(driver);
    waits wait =new waits();
link mainMenuOption = new link(By.xpath(""));
    public WebElement HoverOnMainMenuOption(String menuTab)
    {
      return wait.waitForElementToBeVisible(By.xpath("//ul[contains(@class, 'ui-menu')]//a[span[text()=\""+menuTab+"\"]]"));
    }
public void HoveronsubMenu(String Tabmenu, String Submenu)
{
    action.moveToElement(HoverOnMainMenuOption(Tabmenu)).perform();
    // hover on the main option : -
 //  WebElement subLocater= driver.findElement(wait.waitForElementToBeVisible(By.xpath("//ul[contains(@class, 'ui-menu')]//a[span[text()=\""+Tabmenu+"\"]]/following-sibling::ul//*[span[text()=\""+Submenu+"\"]]")));
  //  action.moveToElement(subLocater).perform();
}

}
