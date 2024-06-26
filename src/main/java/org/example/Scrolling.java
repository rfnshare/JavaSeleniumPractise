package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import java.util.List;

public class Scrolling {
    public static void main(String[] args) {
        RemoteWebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        js.executeScript("document.querySelector(\".tableFixHead\").scrollTop = 5000");

        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
        int a = 0;
        for (WebElement element : elements) {
            int intValue = Integer.parseInt(element.getText());
            a += intValue;
        }
        System.out.println(a);
        String value = driver.findElement(By.className("totalAmount")).getText();
        String[] value_list = value.split(":");
        int result = Integer.parseInt(value_list[1].trim());
        Assert.assertEquals(result, a);
        driver.quit();

    }
}
