package org.example;

import org.openqa.selenium.By;

public class CheckingOutAsGuestPage extends Utils{
    private By _checkingoutAsGuestButton = By.xpath("//button[text()='Checkout as Guest']");
    public void verifyCheckoutAsAGuest(){

        //click on checkout as guest button
        clickOnElement(_checkingoutAsGuestButton);

    }

}
