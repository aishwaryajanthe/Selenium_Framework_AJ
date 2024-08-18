package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features/Login.feature"},
        glue = {"stepdefs"},
        plugin = {"pretty","html:target/reports/cucumber_reports"}
)
public class InstagramRunner {


}
