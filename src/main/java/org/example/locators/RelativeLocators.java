package org.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocators {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());

        WebElement checkboxLabel = driver.findElement(with(By.xpath("//label[@for='exampleCheck1']")));

        driver.findElement(with(By.tagName("input")).toLeftOf(checkboxLabel)).click();

        WebElement dobTagName = driver.findElement(By.xpath("//label[@for='dateofBirth']"));

        driver.findElement(with(By.tagName("input")).below(dobTagName)).click();

        WebElement radioButton = driver.findElement(with(By.id("inlineRadio1")));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText());
    }
}
