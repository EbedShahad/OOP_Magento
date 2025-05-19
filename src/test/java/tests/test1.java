package tests;

import org.testng.annotations.Test;
import pages.HomePage;

public class test1 {
    HomePage home = new HomePage();


    @Test
    public void test1(){

        home.wishlist.click();
    }
}
