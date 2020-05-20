package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browse {
    public static void main(String[] args) {
        load.chrome();
        WebDriver driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
        home_page home = new home_page(driver);
//        home.signinlink().click();
        home.searchbox().sendKeys("dress",Keys.ENTER);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
