package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class googlesearch {
    public static void main(String[] args) {
        load.edge();
        WebDriver d=new EdgeDriver();
        d.get("http://google.com");
        d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("facebook");
        d.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/div[2]/center[1]/input[1]")).click();
        System.out.println(d.getWindowHandle());
        d.quit();
    }
}
