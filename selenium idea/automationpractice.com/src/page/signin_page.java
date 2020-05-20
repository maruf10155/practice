package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin_page {
    WebDriver driver;

    public signin_page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//    create account
    @FindBy(xpath= "//input[@id='email_create']")
    WebElement create_email;
    public WebElement create_email(){
        return create_email;
    }
    @FindBy(xpath = "//button[@id='SubmitCreate']")
    WebElement create_acc;
    public WebElement create_acc(){
        return create_acc;
    }
}
