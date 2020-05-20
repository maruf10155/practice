package test;

import home.home_page;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import search_page.search_page;
import java.util.ArrayList;

public class test {
    WebDriver driver;
    home_page home;
    search_page searchPage;
    @BeforeMethod
    public void bf(){
        load.load.chrome();
        driver =new ChromeDriver();
        home =new home_page(driver);
        searchPage=new search_page(driver);
        driver.navigate().to(home.url);

    }
//    @Test(priority = 1)
//    public void test1() throws InterruptedException {
//        home.search_box().sendKeys("facebook");
//        home.search_btn().click();
//        System.out.println(driver.getTitle());
//
//    }
//    @Test(priority = 2)
//    public void test2(){
//        home.search_box().sendKeys("facebook",Keys.ENTER);
//        System.out.println(driver.getTitle());
//    }
    @Test(priority = 3)
    public void test3(){
        home.search_box().sendKeys("facebook",Keys.ENTER);
        System.out.println(driver.getTitle());
        System.out.println(searchPage.search_page_no());

    }
    @AfterMethod
    public void af(){
        driver.quit();
        System.out.println("finish");
}
}
