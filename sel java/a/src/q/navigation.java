package q;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class navigation {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver",
                "C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver d= new FirefoxDriver();
        d.manage().window().maximize();
        String s="http://facebook.com/";
        //d.get(s);
        d.navigate().to(s);
        System.out.println(d.getTitle());
        d.findElement(By.xpath("//*[@id=\"u_0_b\"]")).click();
        d.get("http://google.com/");
        System.out.println(d.getTitle());
        d.navigate().back();
        d.close();
    }
}
