package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features", glue = { "stepDefinitions" },
		plugin = { "pretty", "html:target/reports/cucumber-reports.html", "json:target/reports/cucumber.json",
				"junit:target/reports/Cucumber.xml", },
		tags = "@abc",
		dryRun = true,
		publish = true)

public class EmrahRunner {

}