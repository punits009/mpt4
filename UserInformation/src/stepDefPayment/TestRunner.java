package stepDefPayment;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/PaymentFeatures",glue="stepDefPayment",plugin="pretty")
public class TestRunner {

}
