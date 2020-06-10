package run;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\maruf\\Desktop\\prac\\selenium idea premium\\cucumber1\\src\\test\\java\\feature",
        glue = "step",
        monochrome = true,
        dryRun = false,
        plugin = {"pretty","html:target/html-report","json:target/report.json","junit:target/report.xml"}

)
public class runner {

}
