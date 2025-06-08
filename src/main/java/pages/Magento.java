package pages;

import pages.HomePage;
import pagesParts.HeaderBar;

import static utils.driverManger.driver;

public class Magento {
/*   I moved the open () from here to the ui generic test
*
*  */

 // let's make objects for all the pages here
 public HeaderBar header = new HeaderBar();
 public LoginPage loginpage= new LoginPage();
 public HomePage homepage = new HomePage();


}
