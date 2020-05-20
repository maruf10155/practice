package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
    WebDriver driver;
    public static String url="http://google.com";
    public home_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(name = "btnK")
    WebElement search_btn;


    public WebElement search_btn() {
        return search_btn;
    }
    @FindBy(name = "q")
    WebElement search_box;


    public WebElement search_box() {
        return search_box;
    }
}
