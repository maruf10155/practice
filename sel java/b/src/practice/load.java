package practice;

public class load {
    public static void firefox(){
        System.setProperty("webdriver.gecko.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\geckodriver.exe");
    }
    public static void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\chromedriver.exe");
    }
    public static void edge(){
        System.setProperty("webdriver.edge.driver","C:\\Users\\maruf\\Desktop\\prac\\webdriver\\msedgedriver.exe");
    }
}
