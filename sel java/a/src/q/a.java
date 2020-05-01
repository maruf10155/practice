package q;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class a {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        WebDriver d = new ChromeDriver();
        //d.manage().window().maximize();
        String s = "http://facebook.com/";
        d.get(s);

        d.close();
    }
}
