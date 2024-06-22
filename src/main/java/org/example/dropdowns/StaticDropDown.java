package org.example.dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement element = driver.findElement(By.cssSelector("select[id*='DropDownListCurrency']"));
        Select select = new Select(element);
        select.selectByIndex(3);
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByVisibleText("INR");
        System.out.println(select.getFirstSelectedOption().getText());
        select.selectByValue("AED");
        System.out.println(select.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        driver.quit();
    }
}
