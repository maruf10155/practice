package q;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectbutton {
    public static void main(String[] args) throws InterruptedException {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
        WebDriver driver= new FirefoxDriver();
        driver.navigate().to("http://facebook.com/");
        //Thread.sleep(50000L);
        //System.out.println(driver.findElement(By.className("_8est")).getText());
        driver.findElement(By.id("u_0_m")).sendKeys("hjkl");
        driver.findElement(By.id("u_0_o")).sendKeys("qwe");
        driver.findElement(By.name("reg_email__")).sendKeys("asd");
        driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
//        q.sendKeys("zxcvb");
//        System.out.println(q.getAttribute("value"));
//        q.clear();
//        System.out.println(q.getAttribute("value"));
      Select a=new   Select(driver.findElement(By.name("birthday_month")));
        System.out.println(a.getFirstSelectedOption().getText());
      a.selectByValue("6");
        Select b=new   Select(driver.findElement(By.name("birthday_day")));
        b.selectByValue("22");
        Select c=new   Select(driver.findElement(By.name("birthday_year")));
        c.selectByValue("1994");
        driver.findElement(By.id("u_0_7")).click();
        driver.findElement(By.xpath("//*[@id=\"u_0_13\"]")).click();








        // driver.close();a
    }
}
