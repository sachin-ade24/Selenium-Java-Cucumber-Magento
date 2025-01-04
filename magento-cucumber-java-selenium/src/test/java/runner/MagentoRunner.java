package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/MagentoLogin.feature",
                 glue={"stepDefinitions", "hooks"}, monochrome=true,
                 plugin = {"pretty", "junit:target/JUnitReports/MagentoLoginReport.xml", 
               		  "json:target/JSONReports/MagentoLoginFile.json", 
               		  "html:target/HtmlReports/MagentoLoginIndex.html"}
		)

public class MagentoRunner {
}
