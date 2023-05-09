package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCartPage extends Utils {
    String expectedProductInShoppingCartMessage = "Product name is not matched";
   // String expectedComputerDetailsMessage = "Details matched";
    private By _productname1 = By.className("product-name");
    private By _computerDetailsInShoppingCart = By.xpath("//td[@class='product']/div[1]");
    private By _checkoutButton = By.cssSelector("button#checkout");
    private By _termsServiceCheckbox = By.cssSelector("input#termsofservice");
    private By _buildYourOwnComputername = By.cssSelector("a.product-name");
    public void compareProductNameInCart() {


        //verify & print out leica camera name text
         String productname1 = getTextFromElement(_productname1);

         System.out.println("Product in cart: "+ productname1);

        //confirm product name is same in shopping cart as what we add
        Assert.assertEquals(productname1,expectedProductInShoppingCartMessage,"Product name is not matched");


    }
    public void verifyDetailsOfBuildYourOwnComputer(){
        String productname = getTextFromElement(_buildYourOwnComputername);
        System.out.println("Product Name: " + productname);

        //verify and assert computer details in shopping cart
        String actualComputerDetails = getTextFromElement(_computerDetailsInShoppingCart);
        System.out.println("ComputerDetails: " +actualComputerDetails);

       Assert.assertNotEquals(actualComputerDetails,"Details not matched");

        //click on terms of service
        clickOnElement(_termsServiceCheckbox);

       //click on checkout button
        clickOnElement(_checkoutButton);
    }

}