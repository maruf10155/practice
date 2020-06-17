package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sign_on extends step.base {
    public String title = "Sign-on: Mercury Tours";

    public WebElement user_box() {
        return driver.findElement(By.name("userName"));
    }

    public WebElement pwd_box() {
        return driver.findElement(By.name("password"));
    }

    public WebElement submit_btn() {
        return driver.findElement(By.name("login"));
    }
}

