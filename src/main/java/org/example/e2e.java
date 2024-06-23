package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@id, 'originStation')]/parent::div//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[contains(@id, 'destinationStation')]/parent::div//a[@value='MAA']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
        Thread.sleep(2000);
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")) {
            System.out.println("Disabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        WebElement adult = driver.findElement(By.id("hrefIncAdt"));
        for (int i = 0; i < 4; i++) {
            adult.click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        WebElement element = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
        Select select = new Select(element);
        select.selectByIndex(3);
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
        Thread.sleep(3000);

    }
}
