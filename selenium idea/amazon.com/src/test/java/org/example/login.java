package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class login {
    WebDriver driver;

    @BeforeTest
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

    @Test
    public void login() {
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.name("email")).sendKeys("maruf10155@gmail.com");
        driver.findElement(By.id("continue")).click();
    }

    @AfterTest
    private void af() {
        driver.quit();
    }
}



