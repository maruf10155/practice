package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        d.manage().window().maximize();
        String s = "http://facebook.com/";
        d.get(s);
        System.out.println(d.getTitle());
        d.findElement(By.id("u_0_b")).click();
        System.out.println(d.getTitle());
        d.close();
    }
}