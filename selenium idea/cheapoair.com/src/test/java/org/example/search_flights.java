package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search_flights {
  public WebDriver driver;
    public static String a = "dfghjkl";
        public search_flights(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
//click one way
    @FindBy(xpath= "//*[@for=\"onewayTrip\"]")
    WebElement one_way;
        public WebElement one_way(){
            return one_way;
        }
//from city
@FindBy(id= "from0")
WebElement from_city;
    public WebElement from_city(){
        return from_city;
    }
//to city
@FindBy(id= "to0")
WebElement to_city;
    public WebElement to_city(){
        return to_city;
    }
//click calander
    @FindBy(id="cal0")
    WebElement cal;
    public WebElement cal(){
        return cal;
    }
    //select date
@FindBy(xpath= "//*[@aria-label=\"17 June 2020\"]")
WebElement date;
    public WebElement date(){
        return date;
    }
//    search
    @FindBy(id="searchNow")
    WebElement search;
    public WebElement search(){
        return search;
    }
    public static String exp_title="CheapOair - Save on Cheap Flights, Cheap Airfares, Cheap Tickets";
}
