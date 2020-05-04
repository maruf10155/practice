package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import java.util.Arrays;
//google feeling lucky
public class p1 {
    public static void main(String[] args) throws InterruptedException {
        load.chrome();
        WebDriver driver= new ChromeDriver();
        driver.get("http://google.com");
        Actions act = new Actions(driver);
        WebElement e1=driver.findElement(By.id("gbqfbb"));
//        e1.click();
        System.out.println(e1.getAttribute("value"));
        act.moveToElement(e1).perform();
        Thread.sleep(5000);
//        System.out.println(e1.getAttribute("value"));
//        String[] xpath={"//span[contains(text(),\"I'm Feeling Doodley\")]",
//        "//span[contains(text(),\"I'm Feeling Artistic\")]","//span[contains(text(),\"I'm Feeling Hungry\")]",
//        "//span[contains(text(),\"I'm Feeling Puzzled\")]","//span[contains(text(),\"I'm Feeling Trendy\")]",
//        "//span[contains(text(),\"I'm Feeling Stellar\")]","//span[contains(text(),\"I'm Feeling Playful\")]",
//        "//span[contains(text(),\"I'm Feeling Wonderful\")]","//span[contains(text(),\"I'm Feeling Generous\")]","//span[contains(text(),\"I'm Feeling Curious\")]",
//        "//div[11]//span[1]"};
        String[] xpath={};
        for (int i=1;i<=11;i++ ){
            String s=String.valueOf(i);
            xpath= Arrays.copyOf(xpath,xpath.length+1);
            xpath[xpath.length-1]="body.hp.vasq:nth-child(2) div.ctr-p:nth-child(4) div.jhp:nth-child(7) form.tsf.nj:nth-child(3) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) div.gbqfba.gbqfba-hvr:nth-child(3) div:nth-child(1) div:nth-child("+s+") > span:nth-child(1)";
        }
        for (int i=0;i<xpath.length;i++){
            if (driver.findElement(By.cssSelector(xpath[i])).isDisplayed()){
                System.out.println(driver.findElement(By.cssSelector(xpath[i])).getText());
                driver.findElement(By.cssSelector(xpath[i])).click();
                break;
            }
        }


        //        driver.quit();

    }
}
//        body.hp.vasq:nth-child(2) div.ctr-p:nth-child(4) div.jhp:nth-child(7) form.tsf.nj:nth-child(3) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) div.gbqfba.gbqfba-hvr:nth-child(3) div:nth-child(1) div:nth-child(10) > span:nth-child(1)
//        body.hp.vasq:nth-child(2) div.ctr-p:nth-child(4) div.jhp:nth-child(7) form.tsf.nj:nth-child(3) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) div.gbqfba.gbqfba-hvr:nth-child(3) div:nth-child(1) div:nth-child(9) > span:nth-child(1)
//        body.hp.vasq:nth-child(2) div.ctr-p:nth-child(4) div.jhp:nth-child(7) form.tsf.nj:nth-child(3) div.A8SBwf:nth-child(1) div.FPdoLc.tfB0Bf:nth-child(4) center:nth-child(1) div.gbqfba.gbqfba-hvr:nth-child(3) div:nth-child(1) div:nth-child(1) > span:nth-child(1)