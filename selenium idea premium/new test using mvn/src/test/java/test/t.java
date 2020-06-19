package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class t {
    @BeforeTest
    public void b(){
        System.out.println("BeforeTest");
    }
    @Test
    public void t(){
        System.out.println("test");
    }
    @AfterTest
    public void a(){
        System.out.println("AfterTest");
    }
}
