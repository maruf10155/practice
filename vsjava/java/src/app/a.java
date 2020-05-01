package app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.close();
        System.out.println("hm");
    }
}