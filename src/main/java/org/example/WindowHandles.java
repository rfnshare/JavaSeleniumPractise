package org.example;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.findElement(By.className("blinkingText")).click();

        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String window = iterator.next();
        String window_two = iterator.next();
        driver.switchTo().window(window_two);

        String email = extractEmail(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.switchTo().window(window);

        driver.findElement(By.id("username")).sendKeys(email);

    }
    public static String extractEmail(String email)
    {
        String[] parts = email.split(" ");
        return parts[4];
    }
}
