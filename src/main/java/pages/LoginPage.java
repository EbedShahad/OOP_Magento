package pages;

import UiElements.Button;
import UiElements.TextBox;
import UiElements.TextField;
import UiElements.link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pagesParts.page;


//web driver to parent
//        web driver get his init ???
//add webdriver to locater in constructoores
//        driver need to pass
//after pass
//        driver in one place and all other compntent can seeit
public class LoginPage extends page {
    WebDriver driver;
    //header and menu not now

    //main content
    TextBox pageTitle = new TextBox(By.cssSelector(".base"));
    TextField email= new TextField(By.cssSelector("#email"));
    TextField password = new TextField(By.cssSelector(".main #pass"));
    Button signIn = new Button(By.cssSelector(".main #send2"));
    link forgetPassword = new link(By.cssSelector(".remind"));
    Button createAccount = new Button(By.cssSelector(".create"));
    // page


}
