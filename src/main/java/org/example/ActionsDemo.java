package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        WebElement account_hover = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
        Actions actions = new Actions(driver);
        WebElement search_box = driver.findElement(By.id("twotabsearchtextbox"));
//        actions.moveToElement(search_box).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
//        actions.moveToElement(account_hover).build().perform();
        actions.moveToElement(account_hover).contextClick().build().perform();
    }
}
