package org.example;
public class load {
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\geckodriver");
    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\chromedriver.exe");
    }
    public static void edge(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\maruf\\Desktop\\library\\webdriver\\msedgedriver.exe");
    }
}

