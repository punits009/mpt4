package stepDefUser;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/UserInformationFeatures",glue="stepDefUser",plugin="pretty")
public class TestRunner {

}
