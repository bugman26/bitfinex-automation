package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(

		plugin = { "pretty", "html:target/cucumber-reports", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
		glue = { "stepdefinitions", "apphooks" }, 
		features = {"src/test/resources/features" }, 
		tags = "@searchHappyPath", monochrome = true

)

public class RunnerTest {

	
	
}
