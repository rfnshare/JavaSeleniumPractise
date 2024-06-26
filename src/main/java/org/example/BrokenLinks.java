package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class BrokenLinks {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        WebElement ul = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[2]"));
        List<WebElement> links = ul.findElements(By.tagName("a"));
        SoftAssert softAssert = new SoftAssert();
        for (WebElement link : links) {
            HttpURLConnection conn = (HttpURLConnection) new URL(link.getAttribute("href")).openConnection();
            conn.setRequestMethod("GET");
            conn.connect();
            System.out.println(conn.getResponseCode());
            softAssert.assertTrue(conn.getResponseCode() < 400, link.getAttribute("href"));
            Thread.sleep(1000);
        }
        driver.quit();
        softAssert.assertAll();
    }
}
