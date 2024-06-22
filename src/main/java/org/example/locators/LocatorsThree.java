package org.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsThree {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        // Parent to child with sibling relation
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());

        // Child to parent
        System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]/parent::div/button[3]")).getText());
        driver.navigate().to("https://rahulshettyacademy.com/");
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.quit();

    }
}
