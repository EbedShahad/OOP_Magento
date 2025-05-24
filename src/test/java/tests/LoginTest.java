package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import pages.MagentoWebsite;
import utils.DriverManager;

import java.sql.Driver;


public class LoginTest {


    @Test
    public void validLogin(){
        MagentoWebsite mw = new MagentoWebsite();
        mw.open();
        mw.productList.getProduct("Push It Messenger Bag").name.hover();
        mw.productList.getProduct("Push It Messenger Bag").addToCart.click();
        String url = mw.loginPage.getCurrentURL();
        System.out.println(url);
    }
    @AfterMethod
    public void teardown()
    {
        DriverManager.quitDriver();
    }
}
