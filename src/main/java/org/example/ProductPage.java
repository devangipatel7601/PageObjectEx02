package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage extends Utils{
    private By _processor = By.cssSelector("select#product_attribute_1");
    private By _ram = By.cssSelector("select#product_attribute_2");
    private By _hdd = By.cssSelector("input#product_attribute_3_6");
    private By _os = By.cssSelector("input#product_attribute_4_9");
    private By _checkBox1 = By.cssSelector("input#product_attribute_5_10");
    private By _checkBox2 = By.cssSelector("input#product_attribute_5_11");
    private By _checkBox3 = By.cssSelector("input#product_attribute_5_12");
    private By _addToCart = By.cssSelector("button#add-to-cart-button-1");
    private By _shoppingCart = By.cssSelector("span.cart-label");
    public void printProductName(){

    List<WebElement> searchText = driver.findElements(By.className("product-title"));

    for (WebElement e:searchText){
        System.out.println(e.getText());

    }

}
    public void buildYourOwnComputer(){
        //select 2.2 GHz processor
        selectOptionByIndex(_processor,1);

        //select 8GB RAM
        selectOptionByValue(_ram,"5");

        //click on 320 GB HDD radio button
        clickOnElement(_hdd);

        //click on vista premium OS radio button
        clickOnElement(_os);
        
        //uncheck on checkbox 1
       clickOnElement(_checkBox1);

       //click on all checkboxes
       clickOnElement(_checkBox1);
       clickOnElement(_checkBox2);
       clickOnElement(_checkBox3);



        //click on add to cart
        clickOnElement(_addToCart);

        //click on shopping cart
        clickOnElement(_shoppingCart);

    }
}
