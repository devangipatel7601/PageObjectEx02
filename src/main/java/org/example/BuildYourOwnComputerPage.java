package org.example;

import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utils{
    private By _emailAFriendButton = By.xpath("//button[text()='Email a friend']");
    public void emailAFriend(){

        //click on email a friend
        clickOnElement(_emailAFriendButton);

    }

}
