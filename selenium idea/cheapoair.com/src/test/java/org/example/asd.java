package org.example;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class asd {
    public static void main(String[] args) throws InterruptedException {
        load.chrome();
        WebDriver driver=new  ChromeDriver();
        driver.get(test_class.url);
        test_class op = new test_class(driver);
        System.out.println(driver.getTitle());
        op.one_way.click();
        op.from_city.clear();
        op.from_city.sendKeys("dhaka");
        Thread.sleep(500);
        op.from_city.sendKeys(Keys.ENTER);
        op.to_city.clear();
        op.to_city.sendKeys("dhaka");
        Thread.sleep(500);
        op.to_city.sendKeys(Keys.ENTER);
        op.cal.click();
        Thread.sleep(1000);
        op.date.click();
        op.search.click();
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.close();

;    }
}
