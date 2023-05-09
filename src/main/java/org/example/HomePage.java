package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class HomePage extends Utils {
     String expectedRegistereduserVoteMessage = "You cannot vote";
     String expectedNonRegisteredUserVoteMsg = "Every user can vote";
     String expectedUsDollarMessage = "US Dollar";
     String expectedEuroMessage = "Euro";
     String expectedVotemsgWithoutSelection = "No Message";
     String expectedWelcomeMessage = "No Message";
    private By _registerButton = By.className("ico-register");
    private By _goodRadioButton = By.id("pollanswers-2");
    private By _voteButton = By.xpath("//button[text()='Vote']");

    private By _verifyErrorVoteMessage = By.className("poll-vote-error");
    private By _login = By.xpath("//a[contains(@class,'ico-login')]");//
    private By _buildYourOwnComputer = By.xpath("//a[@href='/build-your-own-computer'][text()='Build your own computer']");
    private By _verifyVoteMessageForRegUser = By.xpath("//span[@class='poll-total-votes']");
    private By _clickOnAddToCartBuildYourOwnComputer = By.xpath("//div[@class='product-grid home-page-product-grid']/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]");
    private By _clickOnElectronics = By.xpath("//div[@class='master-wrapper-page']/div[2]/ul/li[2]/a[@href='/electronics']");
    private By _HTCAndroidCompareButton = By.xpath("//div[@class='item-grid']/div[3]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _virtual25$GiftCardCompareButton = By.xpath("//div[@class='item-grid']/div[4]/div[1]/div[2]/div[3]/div[2]/button[2]");
    private By _greenBarClose = By.xpath("//span[@class= 'close']");
    private By _productComparisionText = By.xpath("//a[text()='product comparison']");
    private By _clearList = By.className("clear-list");
    private By _searchButton = By.xpath("//button[contains(@type,'submit')]");
    private By _currencySelector = By.cssSelector("select#customerCurrency");
    private By _searchPlaceholderText = By.cssSelector("input.search-box-text");
    private By _usDollar = By.xpath("//option[text()='US Dollar']");
    private By _euro = By.xpath("//option[text()='Euro']");
    private By _facebookLogo = By.cssSelector("li.facebook");
    private By _welcomeMessage = By.xpath("//h2[text()='Welcome to our store']");
    private By _nopComDetailsButton= By.xpath("//a[@href='/nopcommerce-new-release'][text()='details']");
    private By _productPricesFeaturedProducts = By.cssSelector("div.prices");
    public void clickOnRegisterButton() {
        //click on register button
        clickOnElement(_registerButton);
    }

    public void clickOnGoodRadioButton() {
        //click on good radio button
        clickOnElement(_goodRadioButton);
    }

    public void clickOnVoteButton() {
        //click on vote button
        clickOnElement(_voteButton);
    }

    public void verifyNonRegisteredUserShouldNotBeAbleToVoteSuccessfully() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("poll-vote-error")));

        //to verify message pop uo when u click on vote button
        String actualmessage = getTextFromElement(_verifyErrorVoteMessage);

        //to print error messase
        System.out.println("my message: " + actualmessage);
        Assert.assertEquals(actualmessage, expectedNonRegisteredUserVoteMsg, "Non registered customer can vote");
    }

    public void clickOnLogin() {
        //click on login
        clickOnElement(_login);

    }

    public void clickOnBuildYourOwnComputer() {
        clickOnElement(_buildYourOwnComputer);
    }

    public void verifyRegisteredUserShouldBeAbleToVoteSuccessfully() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//ul[@class=\"poll-results\"]/li[1]")));

        String actualmessage = getTextFromElement(_verifyVoteMessageForRegUser);

        System.out.println("message: " + actualmessage);
        Assert.assertEquals(actualmessage, expectedRegistereduserVoteMessage, "You can not vote");

    }

    public void clickOnAddToCartBuildYourOwnComputer() {

        //click on add to cart button on build your own computer
        clickOnElement(_clickOnAddToCartBuildYourOwnComputer);

    }

    public void clickOnElectronics() {
        clickOnElement(_clickOnElectronics);
    }

    public void clickOnHTCAndroidCompareButton() {
        clickOnElement(_HTCAndroidCompareButton);
    }

    public void clickOn25$VirtualGiftCardCompareButton() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        clickOnElement(_virtual25$GiftCardCompareButton);

    }

    public void clickToCloseGreenBar() {
        clickOnElement(_greenBarClose);


    }

    public void clickOnProductComparisionText() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        wait.until(ExpectedConditions.visibilityOfElementLocated(_productComparisionText));
        clickOnElement(_productComparisionText);

    }

    public void printoutProductTitles() {
        //storing web elements inside List
        List<WebElement> productList = driver.findElements(By.cssSelector("div.product-grid h2"));

        //each loop method to print product names on product grid
        for (WebElement e : productList) {
            System.out.println(e.getText());
        }

    }

    public void searchAlertMessage() {
        //click on search button
        clickOnElement(_searchButton);

        //verify message without locator , u cant right click and inspect alert message
        Alert alert = driver.switchTo().alert();

        //to check actual and expected is same
        Assert.assertEquals(alert.getText(), "Please enter some search keyword");

        //click on ok with accept method as u cant click and get locator in alert message
        alert.accept();

    }

    public void printCurrencyInUsDollar() {
           String actualCurrency= getTextFromElement(_usDollar);
           System.out.println("Selected Currency: "+actualCurrency);
            //select euro in currency selector
            selectOptionByText(_currencySelector,"US Dollar");
            //create list for elements
            List<WebElement>actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
            for (WebElement e:actualCurrency1) {
                //print product price with dollar sign
                System.out.println(e.getText());

        }
        Assert.assertEquals(actualCurrency, expectedUsDollarMessage, "US Dollar");
    }
    public void printCurrencyInEuro(){
             String actualCurrency = getTextFromElement(_euro);
             System.out.println("Selected Currency: "+actualCurrency);
             //select euro in currency selector
             selectOptionByText(_currencySelector,"Euro");
             //create list for elements
             List<WebElement>actualCurrency1 = driver.findElements(By.cssSelector("span.price"));
             for (WebElement e:actualCurrency1) {
                 //print product price with euro sign
                 System.out.println(e.getText());
             }

             Assert.assertEquals(actualCurrency, expectedEuroMessage, "Euro");



    }

    public void verifyVoteAlertMessage() {
        clickOnElement(_voteButton);

        //verify message without locator , u cant right click and inspect alert message
        Alert alert = driver.switchTo().alert();

        //to check actual and expected is same
        Assert.assertEquals(alert.getText(), "Please select an answer");

        //click on ok with accept method as u cant click and get locator in alert message
        alert.accept();



    }

    public void searchFunctionality() {
        typeText(_searchPlaceholderText, "adidas");
        clickOnElement(_searchButton);

    }

    public void verifyOpenAndCloseFacebookTabs() {
        //click on fb symbol
        clickOnElement(_facebookLogo);


    }

    public void verifyWelcomeMessage(){

            String currentURL = driver.getCurrentUrl();
            System.out.println("Homepage URL: " + currentURL);
            String actualmessage = getTextFromElement(_welcomeMessage);

            //to print message
            System.out.println("message: " +actualmessage);

            //to verify actual and expected result matched or not
            Assert.assertEquals(actualmessage, expectedWelcomeMessage,"No Message");
        }
    public void clickOnNopComNewRelease(){
            //click on details button of nopcom new release
            clickOnElement(_nopComDetailsButton);
        }

}












