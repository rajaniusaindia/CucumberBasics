package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Applications/APIB06/CucumberBasics/src/test/resources/features/",
        glue = {"stepdefinition", "com.hooks"},
        dryRun = false,
        plugin = "pretty")

public class TestRunner {
}
