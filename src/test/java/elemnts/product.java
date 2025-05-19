package elemnts;

import org.openqa.selenium.By;
public class product {
    /*
    * colors , size option  rating star -> missing */
    String productname  ;
    public product(String productname) {
        this.productname = productname;
    }
    link name = new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\""+productname+"\"]"));
    link picture = new link(By.xpath("//ol//img[@alt=\"\""+productname+"\"\"]"));
    link reviews =new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[contains (text(), \"Reviews\")]"));
   //product price  with $ dollar sign:-
    link price = new link(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//span[@class=\"price\"]"));
    Button cart= new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Cart\"]"));
    Button wishlist = new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Wish List\"]"));
     Button addToComapre =new Button(By.xpath("//ol//img[@alt=\""+productname+"\"]/ancestor::a/following-sibling::div//*[@title=\"Add to Compare\"]"));

    public void run() {
        System.out.println("hello");
    }
}
