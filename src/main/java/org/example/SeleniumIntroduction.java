package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class SeleniumIntroduction {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa.cats.csafeglobal.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.close();
        driver.quit();
    }

    @Test(enabled = false, timeOut = 5000)
    public void Demo() {
        System.out.println("Selenium introduction");
    }

    @Test
//    @Test(groups = {"Smoke"}, dependsOnMethods = {"DemoThree", "Demo"})
    public void DemoTwo() {
        System.out.println("Selenium introduction Two");
    }

    @Parameters({"URL", "KEY"})
    @Test
    public void DemoThree(String url, String key) {
        System.out.println("Selenium introduction Three " + url + key);
    }

    @Test(dataProvider="getData")
    public void DemoFour(String name, String pass) {
        System.out.println("Selenium introduction " + name + " " + pass);
    }

    @BeforeTest
    public void prerequisite() {
        System.out.println("Selenium introduction Initiate");
    }

    @AfterTest
    public void teardown() {
        System.out.println("Selenium introduction End");
    }

    @BeforeSuite
    public void bs() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void as() {
        System.out.println("After Suite");
    }

    @DataProvider
    public Object[][] getData() {
        Object[][] data = new Object[3][2];
        data[0][0] = "faroque";
        data[0][1] = "12345";
        data[1][0] = "raju";
        data[1][1] = "12345";
        data[2][0] = "noman";
        data[2][1] = "12345";

        return data;
    }
}
