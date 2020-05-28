package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
    WebDriver driver;
    search search;
    clicking clicking;
    login login;

    @BeforeMethod

    public void bf() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\geckodriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
//        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().to("http://amazon.com/");
        Thread.sleep(2000);
    }

    @Test(priority = 1)
    public void search_test() throws InterruptedException {
        search = new search(driver);
        search.search_box().clear();
        search.search_box().sendKeys("phone");
        Thread.sleep(1000);
        search.search_box().sendKeys(Keys.ENTER);
        Assert.assertEquals(driver.getTitle(), search.exp_title);
    }

        @Test(priority = 2)
    public void click_test() throws InterruptedException {
        clicking= new clicking(driver);
        System.out.println(clicking.cart().isDisplayed());
        clicking.cart().click();
        Thread.sleep(2000);
        System.out.println(clicking.prime().isDisplayed());
        Assert.assertEquals(driver.getTitle(),clicking.exp_title);
        clicking.prime().click();
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void logintest() throws InterruptedException {
        login = new login(driver);
        login.log().click();
        Thread.sleep(1000);
        System.out.println(login.email().isEnabled());
        login.email().sendKeys("maruf10155@gmail.com");
        login.cont().click();
        Thread.sleep(1000);
    }

    @AfterMethod
    private void af() {
        driver.quit();
    }
}
