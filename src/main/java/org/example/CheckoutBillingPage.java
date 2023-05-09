package org.example;

import org.openqa.selenium.By;

public class CheckoutBillingPage extends Utils{
    private By _firstName = By.cssSelector("input#BillingNewAddress_FirstName");
    private By _lastName = By.cssSelector("input#BillingNewAddress_LastName");
    private By _email = By.cssSelector("input#BillingNewAddress_Email");
    private By _country = By.cssSelector("select#BillingNewAddress_CountryId");
    private By _city = By.cssSelector("input#BillingNewAddress_City");
    private By _addLine1 = By.cssSelector("input#BillingNewAddress_Address1");
    private By _postalCode = By.cssSelector("input#BillingNewAddress_ZipPostalCode");
    private By _phoneNumber = By.cssSelector("input#BillingNewAddress_PhoneNumber");
    private By _continueButton = By.xpath("//button[@onclick='Billing.save()']");
    public void fillInCheckoutBillingDetails(){
        //enter first name
        typeText(_firstName,"Jack");

        //enter last name
        typeText(_lastName,"Smith");

        //enter email
        typeText(_email,"abc@gmail.com");

        //select country from dropdown
        selectOptionByValue(_country,"233");

        //type city name
        typeText(_city,"Harrow");

        //type 1st line of address
        typeText(_addLine1,"105, Liverpool Road");

        //type postal code
        typeText(_postalCode,"HA9 5TY");

        //type phone number
        typeText(_phoneNumber,"0756311111");

        //click on continue
        clickOnElement(_continueButton);





    }
}
