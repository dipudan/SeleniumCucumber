package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(features = "src/test/java/feature",
        plugin = { "pretty", "html:target/cucumber-reports/report.html",
                "json:target/cucumber-reports/cucumber.json",
                "rerun:target/rerun.txt"},
        glue= {"stepDefinition","basePackage"},
        dryRun = false,monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
//public class TestRunner{}
