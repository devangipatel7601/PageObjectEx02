package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Timestamp;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Utils extends BasePage {
    //all reusable methods
    //reusable method with parameters for click on element
    public static void clickOnElement(By by) {

        driver.findElement(by).click();
    }

    //reusable method with parameters for typing text
    public static void typeText(By by, String text) {

        driver.findElement(by).sendKeys(text);
    }

    //reusable method with return type for timestamp
    //e.g to use for multiple email ids
    public static long timeStamp() {
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());
        return timestamp1.getTime();
    }

    //reusable method with return type and parameters for getting text from element
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();

    }

    public static void selectOptionByText(By by, String text) {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }

    public static void selectOptionByIndex(By by, Integer index) {
        Select select = new Select(driver.findElement(by));
        select.selectByIndex(index);
    }

    public static void selectOptionByValue(By by, String value) {
        Select select = new Select(driver.findElement(by));
        select.selectByValue(value);
    }

    // Reusable method for explicit wait with condition URL matches
    public static void explicitWait_UrlMatches(String url) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.urlMatches(url));

    }

    // Reusable method for explicit wait to wait until condition of visibility of element is matched
    public static void explicitWait_VisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    // Reusable method for explicit wait to wait until condition Element to be clickable is matched
    public static void explicitWait_ElementToBeClickable(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    // Reusable method for explicit wait to wait until condition of Invisibility of Element located is matched
    public static void explicitWait_InvisibilityOfElementLocated(By by) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

    // Reusable method for explicit wait to wait until condition of Text to be present in element located is matched
    public static void explicitWait_TextToBePresentInElementLocated(By by, String text) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.textToBePresentInElementLocated(by, text));
    }
    public static void scrollViewElement(By by) {

        WebElement element = driver.findElement(by);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("arguments[0].scrollIntoView(true);", element);
        System.out.println(element.getText());
    }


}






