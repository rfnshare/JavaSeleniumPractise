package org.example.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class UpdateDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(1000);
        WebElement adult = driver.findElement(By.id("hrefIncAdt"));
//        for (int i = 0; i < 4; i++) {
//            adult.click();
//        }
        int i=0;
        while(i<4)
        {
            adult.click();
            i++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).click();
        System.out.println(driver.findElement(By.cssSelector("input[name*='friendsandfamily']")).isSelected());

        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println(checkboxes.size());
        driver.quit();
    }
}
