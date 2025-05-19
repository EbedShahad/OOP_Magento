package utils;

import elemnts.link;
import org.openqa.selenium.By;

public class PanelHeader {
    link SignIn = new  link(By.xpath("//header//*[contains(text(),\"Sign In\")]"));
    link CreateAccount = new link(By.xpath("//header//*[contains(text(),\"Create an Account\")]"));
}
