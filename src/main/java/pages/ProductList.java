package pages;

import UiElements.Custom.ProductItem;
import pagesParts.page;

public class ProductList extends page {

   public ProductItem getProduct(String name )
    {
        return new ProductItem(name);
    }

}
