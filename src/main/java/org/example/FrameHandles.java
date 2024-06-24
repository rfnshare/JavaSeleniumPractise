package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FrameHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
//        driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.id("draggable")).getAttribute("style"));

        Actions actions = new Actions(driver);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dst = driver.findElement(By.id("droppable"));
        actions.dragAndDrop(src, dst).build().perform();
        Assert.assertEquals(driver.findElement(By.id("droppable")).getText(), "Dropped!");
        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("Test");
        driver.quit();
    }
}
