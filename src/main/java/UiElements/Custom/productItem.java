package UiElements.Custom;

import UiElements.Button;
import UiElements.link;
import org.openqa.selenium.By;
public class productItem {
    /*
    * colors , size option  rating star -> missing */
    String productname  ;
    link name ;
    public productItem(String productname) {
        this.productname = productname;
        this.name = new link(By.partialLinkText(productname));
    }

 // new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\""+productname+"\"]"));
    link picture = new link(By.xpath("//ol//img[@alt=\"\""+productname+"\"\"]"));
    link reviews =new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[contains (text(), \"Reviews\")]"));
   //product price  with $ dollar sign:-
    link price = new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//span[@class=\"price\"]"));
    Button cart= new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Cart\"]"));
    Button wishlist = new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Wish List\"]"));
     Button addToComapre =new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Compare\"]"));
     RadioButton xs = new RadioButton(By.xpath(""));
//*[@id="option-label-size-143-item-166"]
}
