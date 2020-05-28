package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class search {
    WebDriver driver;
    String exp_title;
    public search(WebDriver driver){
        this.driver=driver;
        exp_title="Amazon.com : phone";
    }
    public WebElement search_box(){
        return driver.findElement(By.id("twotabsearchtextbox"));
    }
}
