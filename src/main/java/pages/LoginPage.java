package pages;

import UiElements.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pagesParts.HeaderBar;
import pagesParts.page;

//web driver to parent
//        web driver get his init ???
//add webdriver to locater in constructoores
//        driver need to pass
//after pass
//        driver in one place and all other compntent can seeit
public class LoginPage extends page {

    //header and menu
  //  public HeaderBar header = new HeaderBar();
    //main content
    public Label pageTitle = new Label(By.cssSelector(".base"));
    public TextField email= new TextField(By.cssSelector("#email"));
    public TextField password = new TextField(By.cssSelector(".main #pass"));
   // public link signInLink = new link(By.xpath("//header//*[contains(text(),\"Sign In\")]"));
    public Button SignInButton = new Button(By.cssSelector(".login > span"));
    public  link forgetPassword = new link(By.cssSelector(".remind"));
    public Button createAccount = new Button(By.cssSelector(".create"));
    // page
    public Massage inCorrectSignIn = new Massage(By.partialLinkText("sign-in was incorrect"));


}
