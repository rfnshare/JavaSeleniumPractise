package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class LocatorsTwo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        String name = "raju";
        driver.findElement(By.id("inputUsername")).sendKeys(name);
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("signInBtn")).click();
        String success_message = driver.findElement(By.xpath("//div[@class='login-container']/p")).getText();
        System.out.println(success_message);
        Assert.assertEquals(success_message, "You are successfully logged in.");

        String username = driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText();
        System.out.println(username);
        Assert.assertEquals(username, "Hello "+name+",");

        driver.findElement(By.xpath("//button[text()='Log Out']")).click();
        driver.close();
    }
}
