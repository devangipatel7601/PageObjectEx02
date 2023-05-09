package org.example;

import org.openqa.selenium.By;

import static org.example.Utils.*;

public class LoginPage extends Utils{
    private By _email = By.xpath("//input[contains(@class,'email')]");
    private By _password = By.xpath("//input[contains(@class,'password')]");
    private By _loginButton = By.xpath("//button[text() ='Log in']");
    public void fillInLoginDetails(){

        //type email
        typeText(_email, "abc123@gmail.com");

        //type password
        typeText(_password, "Test123");

        //click on login button
        clickOnElement(_loginButton);
    }

}
