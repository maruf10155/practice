package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "step",
        features = "src\\test\\java\\feature",
        plugin = {"pretty","html:target/html-report"}
)
public class runner {
}
