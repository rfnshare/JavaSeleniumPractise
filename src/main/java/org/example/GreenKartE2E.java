package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class GreenKartE2E {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        String[] products = {"Cucumber", "Brocolli", "Beetroot"};
        addItems(products, driver);
        driver.findElement(By.cssSelector(".cart-icon")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        waitUntilVisible(driver, By.cssSelector(".promoCode"), 5);
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();
        waitUntilVisible(driver, By.cssSelector(".promoInfo"), 10);

        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()) {
                    return driver.findElement(By.cssSelector("[id='finish'] h4"));
                } else {
                    return null;
                }
            }
        });
        System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
        driver.quit();
    }
    public static void addItems(String[] products, WebDriver driver) {
        for (String product : products) {
            String xpathExpression = String.format("//h4[text()='%s']/parent::div//button", product + " - 1 Kg");
            driver.findElement(By.xpath(xpathExpression)).click();
        }
    }

    public static void waitUntilVisible(WebDriver driver, By locator, int second) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(second));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement apply(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }
}


