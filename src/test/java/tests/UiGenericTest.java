package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.driverManger;

public class UiGenericTest {
    // for setup method
    @BeforeTest
    public  void open(){

        driverManger.getDriver().get("https://magento.softwaretestingboard.com/");
     //   driver.get("https://demo.guru99.com/test/radio.html");
    }
    // and for open method
    @AfterTest
public void tearDown(){
    driverManger.quitDriver();
}
}
