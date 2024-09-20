package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features",
        glue = { "stepDefinitions" },
        plugin = { "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
        tags = " @e2e",
        dryRun = false,
        publish = true
)

public class HasanRunner {

}