package q;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class conditionalcommand {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
//        driver.manage().window().maximize();
        driver.get("http://www.yahoo.com/");
        WebElement ele1 = driver.findElement(By.id("header-signin-link"));
//        System.out.println(ele1.isDisplayed());
//        System.out.println(ele1.isEnabled());
        ele1.click();
        WebElement ele2 = driver.findElement(By.name("username"));
//        System.out.println(ele2.isDisplayed());
//        System.out.println(ele2.isEnabled());
        ele2.sendKeys("maruf10155@yahoo.com");
        WebElement ele3= driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/div[2]/form/div[3]/div[1]/span/label"));
        ele3.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"login-passwd\"]")).sendKeys("01822924519");
        driver.findElement(By.xpath("//*[@id=\"login-signin\"]")).click();
    }
}
