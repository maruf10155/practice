package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class findaflight extends step.base {

    public WebElement sign_off(){
        return driver.findElement(By.linkText("SIGN-OFF"));
    }

}
