package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(

            features = {"src/test/resources/Features"},
            //glue={"Stepdefinations"},
            tags={"@HRM"},
//            dryRun=false,
//            //monochrome=true,
            format={"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml_output/cucumber.xml"}


    )
    public class MyTestRunner {


    }
