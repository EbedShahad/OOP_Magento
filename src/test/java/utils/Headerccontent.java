package utils;

import elemnts.TextField;
import elemnts.link;
import org.openqa.selenium.By;

public class Headerccontent {
    link logo = new link(By.xpath("//*[@class = \"logo\"]"));
    TextField searchBox = new TextField(By.id("id=\"search\""));
    link cartIcon = new link(By.className("action showcart"));

}
