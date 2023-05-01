package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;


public class ProductEmailAFriendPage extends Utils{
    static String expectedSendEmailMessage ="Your message has not been sent";
    static String expectedSendEmailErrorMessage = "Non registered user can use email a friend feature";
    private By _enterFriendEmail = By.xpath("//input[contains(@class,'friend-email')]");
    private By _enterPersonalMessage = By.xpath("//textarea[contains(@name,'PersonalMessage')]");
    private By _sendEmailButton = By.xpath("//button[text()='Send email']");
    private By _SendEmailMessage = By.xpath("//div[@class='result']");
    private By _enterYourEmailId = By.id("YourEmailAddress");
    private By _sendEmailErrorMessage = By.xpath("//li[text()='Only registered customers can use email a friend feature']");
public void fillInEmailAFriendDetailsRegisteredUser(){
    //type friend's email
    typeText(_enterFriendEmail, "hellofriend" + timeStamp() + "@gmail.com");

    //type personal message
    typeText(_enterPersonalMessage,"Check this one is good");

    //click on Send Email button
    clickOnElement(_sendEmailButton);
    String actualmessage = getTextFromElement(_SendEmailMessage);

    //to print error messase
    System.out.println("my message: " +actualmessage);
    Assert.assertEquals(actualmessage,expectedSendEmailMessage,"Non registered customer can vote");
}
public void fillInEmailAFriendDetailsNonRegisteredUser(){

    //type friend's email
    typeText(_enterFriendEmail, "hellofriend" + timeStamp() + "@gmail.com");

    //type your email address
    typeText(_enterYourEmailId,"abc@gmail.com");

    //type personal message
    typeText(_enterPersonalMessage,"Check this one is good");

    //click on Send Email button
    clickOnElement(_sendEmailButton);
    String actualmessage = getTextFromElement(_sendEmailErrorMessage);

    //to print error messase
    System.out.println("my message: " +actualmessage);

    Assert.assertEquals(actualmessage,expectedSendEmailErrorMessage,"Non registered user can use email a friend feature");
}
}

