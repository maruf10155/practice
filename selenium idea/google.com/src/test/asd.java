package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.util.List;

public class asd {
    public static void main(String[] args) throws InterruptedException {
        load.load.chrome();
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
        driver.findElement(By.name("q")).sendKeys("facebook", Keys.ENTER);
        Thread.sleep(5000);
        List<WebElement> asd=driver.findElements(By.className("SJajHc NVbCr"));
        System.out.println(asd.size());
//asd.get(2).click();
    }
}
