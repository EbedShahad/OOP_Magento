package pages;

import pagesParts.page;

public class MagentoWebsite extends page {
   public void open ()
    {
        driver.get("https://magento.softwaretestingboard.com/");
    }
    public  LoginPage loginPage= new LoginPage();
   public ProductList productList= new ProductList();
}
