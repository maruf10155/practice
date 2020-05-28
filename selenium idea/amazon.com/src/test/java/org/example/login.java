package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class login {
    WebDriver driver;
    String exp_title;

    public login(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement log() {
        return driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
    }

    public WebElement email() {
        return driver.findElement(By.name("email"));
    }

    public WebElement cont() {
        return driver.findElement(By.id("continue"));
    }
}



