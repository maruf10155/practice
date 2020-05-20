package search_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class search_page {
    WebDriver driver;
    public search_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
}
@FindBy(className = "fl")
List<WebElement> search_pgno;
    public List<WebElement> search_page_no(){
        return search_pgno;
    }
}
