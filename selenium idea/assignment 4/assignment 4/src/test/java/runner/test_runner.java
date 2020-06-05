package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\maruf\\Desktop\\prac\\selenium idea\\assignment 4\\assignment 4\\src\\test\\java\\features",
        glue = "step_definition"
)
public class test_runner {

}
