package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CartPage extends Utils {
    String expectedProductInShoppingCartMessage = "Product name is not matched";
    private By _productname1 = By.className("product-name");
    public void compareProductNameInCart() {

        //verify & print out leica camera name text
         String productname1 = getTextFromElement(_productname1);

         System.out.println("Product in cart: "+ productname1);

        //confirm product name is same in shopping cart as what we add
        Assert.assertEquals(productname1,expectedProductInShoppingCartMessage,"Product name is not matched");


    }
}