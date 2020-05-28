package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test1 {
    WebDriver driver;
    search_flights searchFlights;
    @BeforeTest
    public void bf(){
        load.chrome();
        driver= new ChromeDriver();
        searchFlights=new search_flights(driver);
        driver.manage().deleteCookieNamed("cheapoair.com");
        driver.manage().deleteCookieNamed("www.cheapoair.com");
        driver.manage().window().maximize();
        driver.get("http://cheapoair.com");

    }
    @Test(priority = 1)
    public void t1() throws InterruptedException {
        System.out.println(search_flights.a);
        searchFlights.one_way.click();
        Thread.sleep(1000);
        searchFlights.from_city().clear();
        searchFlights.from_city().sendKeys("dhaka");
        Thread.sleep(1000);
        searchFlights.from_city().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        Assert.assertEquals("DAC - Dhaka, Bangladesh",searchFlights.from_city().getAttribute("value"));
        searchFlights.to_city().clear();
        searchFlights.to_city().sendKeys("dubai");
        Thread.sleep(500);
        searchFlights.to_city().sendKeys(Keys.ENTER);
        Thread.sleep(1000);
        Assert.assertEquals("DXB - Dubai, United Arab Emirates",searchFlights.to_city().getAttribute("value"));
        searchFlights.cal().click();
        Thread.sleep(500);
        searchFlights.date().click();
        Thread.sleep(1000);
        searchFlights.search().click();
        Thread.sleep(2000);
        Assert.assertEquals(search_flights.exp_title,driver.getTitle());
    }
    @AfterTest
    public  void af(){
        driver.close();
    }

}
