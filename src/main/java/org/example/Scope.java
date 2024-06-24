package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Scope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        WebElement ul = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(ul.findElements(By.tagName("a")).size());
        for (int i = 1; i < ul.findElements(By.tagName("a")).size(); i++) {
            String clickolinktab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            ul.findElements(By.tagName("a")).get(i).sendKeys(clickolinktab);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator= windows.iterator();
        while (iterator.hasNext()) {
            driver.switchTo().window(iterator.next());
            System.out.println(driver.getTitle());
        }
    }
}
