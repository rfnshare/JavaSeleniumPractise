package org.example;

import org.testng.annotations.*;

public class SeleniumIntroduction {
//    public static void main(String[] args) {
//        WebDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.get("https://qa.cats.csafeglobal.com/");
//        System.out.println(driver.getTitle());
//        System.out.println(driver.getCurrentUrl());
//        driver.close();
//        driver.quit();
//    }
    @Test
    public void Demo()
    {
        System.out.println("Selenium introduction");
    }
    @Test
    public void DemoTwo()
    {
        System.out.println("Selenium introduction Two");
    }
    @BeforeTest
    public void prerequisite()
    {
        System.out.println("Selenium introduction Initiate");
    }

    @AfterTest
    public void teardown()
    {
        System.out.println("Selenium introduction End");
    }
    @BeforeSuite
    public void bs()
    {
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void as()
    {
        System.out.println("After Suite");
    }
}
