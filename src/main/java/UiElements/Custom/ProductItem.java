package UiElements.Custom;

import UiElements.Button;
import UiElements.link;
import org.openqa.selenium.By;

public class ProductItem {

        /*
         * colors , size option  rating star -> missing */
       static  String productname  ;
    public link name;
        public ProductItem(String productname) {
            this.productname = productname;
           this.name = new link(By.partialLinkText(productname));

        }
//        public link name = new link(By.partialLinkText(productname));
        link picture = new link(By.xpath("//img[@alt=\"\""+productname+"\"\"]"));
        link reviews =new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[contains (text(), \"Reviews\")]"));
        //product price  with $ dollar sign:-
        link price = new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//span[@class=\"price\"]"));
        public Button addToCart= new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Cart\"]"));
        Button wishlist = new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Wish List\"]"));
        Button addToComapre =new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Compare\"]"));

        public void run() {
            System.out.println("hello");
        }
    }


