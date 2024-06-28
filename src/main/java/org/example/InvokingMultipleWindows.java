package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;
import java.util.Iterator;
public class InvokingMultipleWindows {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String window = iterator.next();
        String window_two = iterator.next();
        driver.switchTo().window(window_two);
        driver.get("https://rahulshettyacademy.com/");
        String courseName = driver.findElement(By.xpath("(//div[@class='upper-box']/h2/a)[1]")).getText();
        driver.switchTo().window(window);
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys(courseName);
        driver.quit();
    }
}
