package org.example.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //div[contains(@id, 'destinationStation')]/parent::div//a[@value='MAA']
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@id, 'originStation')]/parent::div//a[@value='BLR']")).click();
//        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@id, 'destinationStation')]/parent::div//a[@value='MAA']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
