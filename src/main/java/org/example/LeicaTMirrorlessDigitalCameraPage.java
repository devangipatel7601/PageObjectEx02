package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LeicaTMirrorlessDigitalCameraPage extends Utils {
    private By _productname = By.xpath("//div[@class=\"product-name\"]/h1");
    private By _AddToCart = By.xpath("//div[@class=\"add-to-cart\"]/div/button");
    private By _shoppingCart = By.xpath("//span[@class=\"cart-label\"]");
    private By _productname1 = By.className("product-name");

    public void leicaCameraAddToCartAndShoppingCart() {

        //get product name Leica Camera
        String productname = getTextFromElement(_productname);

        //print Leica camera
        System.out.println("Print Product Name: " +productname);

        //click on Add to cart button
        clickOnElement(_AddToCart);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));

        //click on shopping cart on top right corner
        clickOnElement(_shoppingCart);


    }
}