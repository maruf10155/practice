package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home_page {
    WebDriver driver;

    public home_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(className = "login")
    WebElement signin;

    public WebElement signinlink() {
        return signin;
    }

    @FindBy(name = "search_query")
    WebElement search;

    public WebElement searchbox() {
        return search;
    }
}
