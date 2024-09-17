package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

		features = "src/test/resources/features",
		glue = { "stepDefinitions" },
		plugin = { "pretty",
				"html:target/Pounehreports/cucumber-reports.html",
				"json:target/Pounehreports/cucumber.json",
				"junit:target/Pounehreports/Cucumber.xml",
				 },
		tags = " @t1",
		dryRun = false,
		publish = true
)

public class PounehRunner {

}