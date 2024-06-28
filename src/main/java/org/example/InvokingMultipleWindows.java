package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;
import java.util.Iterator;
public class InvokingMultipleWindows {
    public static void main(String[] args) throws IOException {
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--headless");
        WebDriver driver = new ChromeDriver(option);
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
        WebElement nameEditBox = driver.findElement(By.xpath("//input[@name='name']"));
        nameEditBox.sendKeys(courseName);
        File file = nameEditBox.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("E:\\Screenshot\\screenshot.png"));

        System.out.println("Height: "+nameEditBox.getRect().getHeight());;
        System.out.println("Width: "+nameEditBox.getRect().getWidth());;
        driver.quit();
    }
}
