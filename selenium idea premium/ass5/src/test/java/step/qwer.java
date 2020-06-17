package step;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qwer {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
////        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\geckodriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        Thread.sleep(1000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        WebElement a=driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div"));
        System.out.println(a.isDisplayed());
        je.executeScript("arguments[0].scrollIntoView(true)",a);
        Actions actions = new Actions(driver);
        actions.moveToElement(a).perform();
        Thread.sleep(1000);
        String exp = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div[1]/ul[1]/li[2]/div/div[2]/div[2]/a[1]/span")).getText();
        System.out.println(exp.equals("Add to cart"));
        Thread.sleep(1000);
        driver.quit();
    }
}
