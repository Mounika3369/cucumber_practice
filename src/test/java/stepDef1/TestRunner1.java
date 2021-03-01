package stepDef1;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/Features"},
        tags={"@login"},
        dryRun=true,
        //monochrome=true,
        format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}


)

public class TestRunner1 {
}

