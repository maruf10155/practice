package runner;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
        features="C:\\Users\\maruf\\Desktop\\prac\\selenium idea\\cucumber1\\src\\test\\java\\Features\\title.feature",
        glue="org.example"
)
public class test_runner {
}
