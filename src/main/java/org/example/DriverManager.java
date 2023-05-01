package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager extends Utils{
    public void openBrowser()
    {
        driver = new ChromeDriver();

        //open demonopcommerce url
        driver.get("https://demo.nopcommerce.com/");

        //to maximize window
        driver.manage().window().maximize();

        //for implicit wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }
    public void closeBrowser()
    {

        driver.close();
    }

}
