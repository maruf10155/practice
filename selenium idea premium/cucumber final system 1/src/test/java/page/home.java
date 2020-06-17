package page;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class home extends step.base {


    public WebElement sign_on(){
        return driver.findElement(By.linkText("SIGN-ON"));
    }
    public WebElement register(){
        return driver.findElement(By.linkText("REGISTER"));
    }
    public WebElement support(){
        return driver.findElement(By.linkText("SUPPORT"));
    }
    public WebElement contact(){
        return driver.findElement(By.linkText("CONTACT"));
    }
}
