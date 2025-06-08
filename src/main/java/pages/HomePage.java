package pages;

import UiElements.Button;
import UiElements.Label;
import UiElements.link;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pagesParts.page;
import utils.driverManger;

import java.util.List;
public class HomePage extends page {
WebDriver driver;

//    public HomePage() {
//        this.driver =driverManger.getDriver();
//    }
    // get product numbers :
//String pageTitle = driver.getTitle();
    //Hot Sellers
 //   public List<WebElement> listProducts = driver.findElements(By.xpath("//ol//li"));
 //  public int productNumbers = listProducts.size();
    String bagName ="Fusion Backpack" ;
    public link productName = new link(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//*[@title=\""+ bagName +"\"]"));
    public link productPicture = new link(By.xpath("//ol//img[@alt=\"\""+ bagName +"\"\"]"));
    public link productReviews =new link(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//*[contains (text(), \"Reviews\")]"));
    //product price  with $ dollar sign:-
    public link productPrice = new link(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//span[@class=\"price\"]"));
    public Button cart= new Button(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Cart\"]"));
    public Button wishlist = new Button(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Wish List\"]"));
    public Button addToComapre =new Button(By.xpath("//ol//img[@alt=\""+ bagName +"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Compare\"]"));
    public Label welcome= new Label(By.xpath("//header//*[contains(text(),\"Welcome\")]"));


}
