package pagesParts;

import UiElements.Button;
import UiElements.TextField;
import UiElements.link;
import org.openqa.selenium.By;


public class HeaderBar {
    public link SignIn = new link(By.xpath("//*[@class=\"panel header\"]//*[@class=\"authorization-link\"]/a[contains(text(),\"Sign In\")]"));
    public  link CreateAccount = new link(By.xpath("//*[@class=\"panel header\"]//li/a[contains(text(),\"Create an Account\")]"));
    public Button logo = new Button(By.cssSelector(".logo"));
   public TextField searchBox = new TextField(By.cssSelector("#search"));
    public link cartIcon = new link(By.cssSelector(".showcart"));
   // public mainMenu
}
