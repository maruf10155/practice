package q;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testsearch {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
    }
}
