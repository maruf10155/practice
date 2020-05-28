package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_class {
WebDriver driver;
WebElement one_way,from_city,to_city,cal,date,search;
    public test_class(WebDriver driver){
        this.one_way=driver.findElement(By.xpath("//*[@for=\"onewayTrip\"]"));
        this.from_city=driver.findElement(By.id("from0"));
        this.to_city=driver.findElement(By.id("to0"));
        this.cal=driver.findElement(By.id("cal0"));
        this.date=driver.findElement(By.xpath("//*[@aria-label=\"17 June 2020\"]"));
        this.search=driver.findElement(By.id("searchNow"));

    }
    public static String a="ghj";
    public static String url="http://cheapoair.com";
}
