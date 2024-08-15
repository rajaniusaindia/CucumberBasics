package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Applications/APIB06/CucumberBasics/src/test/resources/features/",
        glue = {"stepdefinition", "com.hooks"},
        ///tags = "@bvt or @epic102",
        dryRun = false,
        //dryRun = true,
        //plugin = {"pretty", "json:target/reports/report.json"})

        // Throwing error
        // plugin = {"pretty",
        //     "json:target/reports/report.json",
        //     "xml:target/reports/report.xml"})
        // change xml => to json
        //plugin = {"pretty",
        //       "json:target/reports/report.json",
        //       "json:target/reports/report.xml"})
        // Extent Report
        plugin = {"pretty",
                "json:target/reports/report.json",
                "json:target/reports/report.xml",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, publish = true)

// delete cucumber.properties
public class TestReport {
}
