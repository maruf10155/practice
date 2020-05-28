package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nmb {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
//        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\geckodriver.exe");
       WebDriver driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
//        Thread.sleep(2000);
        driver.manage().window().maximize();
        driver.navigate().to("http://amazon.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
        driver.findElement(By.name("email")).sendKeys("456");
        driver.findElement(By.id("continue")).click();
    }
}
