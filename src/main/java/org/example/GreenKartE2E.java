package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKartE2E {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] products = {"Cucumber", "Brocolli", "Beetroot"};
        for (String product : products) {
            String xpathExpression = String.format("//h4[text()='%s']/parent::div//button", product + " - 1 Kg");
            driver.findElement(By.xpath(xpathExpression)).click();
        }
    }
}
