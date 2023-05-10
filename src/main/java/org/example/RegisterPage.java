package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Utils{
    private By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private By _email = By.name("Email");
    private By _password = By.id("Password");
    private  By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private By _loginButton = By.xpath("//button[text() ='Log in']");
    private By _dateOFBirth = By.xpath("//select[contains(@name,'DateOfBirthDay')]");
    private By _monthOfBirth = By.xpath("//select[contains(@name,'DateOfBirthMonth')]");
    private By _yearOfBirth = By.xpath("//select[contains(@name,'DateOfBirthYear')]");
    public void enterRegistrationDetails(){

        //enter first name
        typeText(_firstname, "testFirstName");

        //enter last name
        typeText(_lastname, "testLatName");

        //select dob from dropdown
        selectElementByText(_dateOFBirth,"13");

        //select month of birth from dropdown
        selectElementByIndex(_monthOfBirth,1);

        //select year of month from drop down
        selectElementByValue(_yearOfBirth,"1992");


        //enter email id
        typeText(_email, "tina" + timeStamp() + "@gmail.com");

        //enter password
        typeText(_password, "Test123");

        //enter and confirm password
        typeText(_confirmPassword, "Test123");

        //click on register button
        clickOnElement(_registerButton);

    }

}
