package pagesParts;

import UiElements.Custom.productItem;

public class productList extends page{
    public productItem getProduct(String name )
    {
        return new productItem(name);
    }
}
