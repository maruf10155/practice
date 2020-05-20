package page;

import org.testng.annotations.*;

public class test2 {
    String a;
    int s;
    float d;

    @BeforeMethod
    public void bef(){
        System.out.println("bef");
    }
    @Test
    public void t1(){
        System.out.println("t1");
    }
    @Test
    public void t2(){
        System.out.println("t2");
    }
    @Test
    public void t3(){
        System.out.println("t3");
    }
    @AfterMethod
    public void f(){
        System.out.println("finish");
    }
}
