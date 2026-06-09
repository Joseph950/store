package configs;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.runner.RunWith;
import reports.GenerateReport;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\resources\\features",
        glue = "steps",
        plugin = {
                "pretty",
                "html:target/cucumber-reports/index.html",
                "json:target/cucumber-reports/cucumber.json",
                "junit:target/cucumber-reports/cucumber.xml"
        },
        tags = "@first",
        publish = true

)
public class RunCucumber {

    public RunCucumber() {
    }

    @AfterClass
    public static void tearDown() {
        GenerateReport.generate();
    }
}

