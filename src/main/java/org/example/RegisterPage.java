package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils{
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _email = By.name("Email");
    private By _password = By.id("Password");
    private  By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private By _loginButton = By.xpath("//button[text() ='Log in']");
    public void enterRegistrationDetails(){

        //enter first name
        typeText(_firstname, "testFirstName");

        //enter last name
        typeText(_lastname, "testLatName");

        //enter email id
        typeText(_email, "hellofriend@gmail.com");

        //enter password
        typeText(_password, "Test123");

        //enter and confirm password
        typeText(_confirmPassword, "Test123");

        //click on register button
        clickOnElement(_registerButton);
    }

}
