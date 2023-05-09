package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class CompareProductsPage extends Utils {
    String expectedCompare2ProductsMessage = "There are 2 products still after clearing List";
    private By _mobilename = By.xpath("//table[@class='compare-products-table']/tbody/tr[3]/td[2]/a");
    private By _giftcardName = By.xpath("//table[@class='compare-products-table']/tbody/tr[3]/td[3]/a");
    private By _clearList = By.className("clear-list");
    private By _clearListMessage = By.className("no-data");
    public void productComparisionPage() {

        //printout mobile name
        String actualmessage = getTextFromElement(_mobilename);
        System.out.println("message: " + actualmessage);

        //printout card name
        String actualmessage1 = getTextFromElement(_giftcardName);
        System.out.println("message: " + actualmessage1);

        //click on clear list button
        clickOnElement(_clearList);

        //printout msg after clicking on clear list
        String actualmessage2 = getTextFromElement(_clearListMessage);
        System.out.println("message :" + actualmessage2);

        Assert.assertEquals(actualmessage2,expectedCompare2ProductsMessage,"There are 2 products still after clearing List");

    }

}