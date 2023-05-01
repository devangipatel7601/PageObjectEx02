package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {
    static String expectedRegistereduserVoteMessage = "You cannot vote";
    static String expectedNonRegisteredUserVoteMsg ="Every user can vote";
    private By _registerButton = By.className("ico-register");
    private By _goodRadioButton = By.id("pollanswers-2");
    private By _voteButton = By.xpath("//button[text()='Vote']");

    private By _verifyErrorVoteMessage = By.className("poll-vote-error");
    private By _login = By.xpath("//a[contains(@class,\"ico-login\")]");//
    private By _buildYourOwnComputer = By.xpath("//a[@href=\"/build-your-own-computer\"][text()='Build your own computer']");
    private By _verifyVoteMessageForRegUser = By.xpath("//span[@class=\"poll-total-votes\"]");
    private By _clickOnAddToCartBuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
    private By _clickOnElectronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a[@href='/electronics']");
    private By _HTCAndroidCompareButton = By.xpath("//div[@class='item-grid']/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _virtual25$GiftCardCompareButton = By.xpath("//div[@class='item-grid']/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _greenBarClose = By.xpath("//span[@class= \"close\"]");
    private By _productComparisionText = By.xpath("//a[text()='product comparison']");
    private By _clearList = By.xpath("");
    public void clickOnRegisterButton(){
        //click on register button
        clickOnElement(_registerButton);
    }
    public void clickOnGoodRadioButton(){
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }
    public void clickOnVoteButton(){
        //click on vote button
        clickOnElement(_voteButton);
    }
    public void verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully(){
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("poll-vote-error")));

        //to verify message pop uo when u click on vote button
        String actualmessage = getTextFromElement(_verifyErrorVoteMessage);

        //to print error messase
        System.out.println("my message: " +actualmessage);
        Assert.assertEquals(actualmessage,expectedNonRegisteredUserVoteMsg,"Non registered customer can vote");
    }
    public void clickOnLogin(){
        //click on login
        clickOnElement(_login);

    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(_buildYourOwnComputer);
    }
    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

      //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"poll-results\"]/li[1]")));

        String actualmessage = getTextFromElement(_verifyVoteMessageForRegUser);

        System.out.println("message: " + actualmessage);
        Assert.assertEquals(actualmessage, expectedRegistereduserVoteMessage, "You can not vote");

    }
    public void clickOnAddToCartBuildYourOwnComputer(){

        //click on add to cart button on build your own computer
        clickOnElement(_clickOnAddToCartBuildYourOwnComputer);

    }
    public void clickOnElectronics(){
        clickOnElement(_clickOnElectronics);
    }
    public void clickOnHTCAndroidCompareButton(){
        clickOnElement(_HTCAndroidCompareButton);
    }
    public void clickOn25$VirtualGiftCardCompareButton(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnElement(_virtual25$GiftCardCompareButton);

    }
    public void clickToCloseGreenBar(){
        clickOnElement(_greenBarClose);


    }
    public void clickOnProductComparisionText(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_productComparisionText));
        clickOnElement(_productComparisionText);

    }


    }








