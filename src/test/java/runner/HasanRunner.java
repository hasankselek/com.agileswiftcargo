package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = { "stepDefinitions" },
        plugin = { "pretty",
                "html:target/HasanReports/cucumber-reports.html",
                "json:target/HasanReports/cucumber.json",
                "junit:target/HasanReports/Cucumber.xml",
        },
        tags = " @US_018",
        dryRun = false,
        publish = true
)

public class HasanRunner {

}