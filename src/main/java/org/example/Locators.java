package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        driver.findElement(By.id("inputUsername")).sendKeys("rahul");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
//        Thread.sleep(3000);
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());

        driver.findElement(By.linkText("Forgot your password?")).click();
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Abdullah Al Faroque");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rfnshare@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("1234567890");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String password_text = getPassword(driver.findElement(By.cssSelector("form p[class='infoMsg']")).getText(), driver);
        System.out.println("Password: " + password_text);
        driver.findElement(By.className("go-to-login-btn")).click();

        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys(password_text);
        Thread.sleep(1000);
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.id("chkboxTwo")).click();
        driver.findElement(By.xpath("//button[contains(text(),'Sign')]")).click();
        System.out.println(driver.findElement(By.xpath("//div[@class='login-container']/p")).getText());
        Thread.sleep(5000);
        driver.close();
    }

    public static String getPassword(String password, WebDriver driver) {
        String[] password_array = password.split("'");
        System.out.println("Driver: "+ driver);
        System.out.println(driver.getCurrentUrl());
        return password_array[1].split("'")[0];
    }
}
