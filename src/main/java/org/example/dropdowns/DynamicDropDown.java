package org.example.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DynamicDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //div[contains(@id, 'destinationStation')]/parent::div//a[@value='MAA']
//        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[contains(@id, 'originStation')]/parent::div//a[@value='BLR']")).click();
////        driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//div[contains(@id, 'destinationStation')]/parent::div//a[@value='MAA']")).click();
//        Thread.sleep(2000);
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//        Thread.sleep(2000);
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        Thread.sleep(2000);
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("Enabled");
            Assert.assertTrue(true);
        }
        driver.quit();
    }
}
