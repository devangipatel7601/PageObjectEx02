package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegisterResultPage extends Utils{
    static String expectedRegistrationCompleteMsg = "Registration not working";
    private By _regmsg = By.xpath("//div[@class='result']");
    public void verifyUserRegisteredSuccessfully(){

        //verify message
        String actualmessage = getTextFromElement(_regmsg);

        //to print message
        System.out.println("message: " +actualmessage);

        //to verify actual and expected result matched or not
        Assert.assertEquals(actualmessage,expectedRegistrationCompleteMsg,"Registration not working");

    }

}
