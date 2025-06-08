package tests;

import tests.UiGenericTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Magento;


import static utils.pagesURL.HomePageUrl;


public class LoginTest extends UiGenericTest {
//valid email : ali@ali.com
    // valid password : ASas123@@
    Magento mw = new Magento();
    SoftAssert soft = new SoftAssert();
    @Test
    public void LoginWithValidEmailAndPassword(){
        mw.homepage.header.SignIn.click();
        mw.loginpage.email.Write("ali@ali.com");
        mw.loginpage.password.Write("ASas123@@");
        mw.loginpage.SignInButton.click();
        soft.assertEquals(mw.homepage.getCurrentURL(),HomePageUrl,"This is not the home page ");
        soft.assertTrue(mw.homepage.welcome.isDisplayed(),"login was not successfully");
        soft.assertAll();
    }
//    public void LoginWithInvalidEmailAndPassword(){
//        mw.homepage.header.SignIn.click();
//        mw.loginpage.email.Write("aaaaa@aaa.com");
//        mw.loginpage.password.Write("asdsasasa");
//        mw.loginpage.SignInButton.click();
//        soft.assertTrue(mw.loginpage.inCorrectSignIn.isDisplayed(),"unauthorized user had signed in");
//        soft.assertAll();
//    }

    //Login with invalid password
    //Login with invalid name
    //Login with empty fields
    //Login with unregistered email
}

