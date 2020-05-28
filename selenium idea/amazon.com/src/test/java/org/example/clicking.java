package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class clicking {
    WebDriver driver;
    String exp_title,getExp_title2;

    public clicking(WebDriver driver) {
        this.driver=driver;
        exp_title="Amazon.com Shopping Cart";
        getExp_title2="Amazon.com: Amazon Prime";

    }
    public WebElement cart(){
        return driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[5]"));
    }
    public WebElement prime(){
        return driver.findElement(By.xpath("//*[@id=\"nav-link-prime\"]/span"));
    }
}
