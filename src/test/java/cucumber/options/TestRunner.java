package cucumber.options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", plugin = { "pretty", "html:target/cucumber-html-report",
		"json:target/jsonReports/cucumber-report.json", "junit:target/cucumber-reports/Cucumber.xml",
		"html:target/cucumber-reports" }, glue = "stepdefinations", tags = { "@ratesapi" })
public class TestRunner {

}
