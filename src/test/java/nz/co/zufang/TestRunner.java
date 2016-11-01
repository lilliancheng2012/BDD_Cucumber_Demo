package nz.co.zufang;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/CRUDFeatures",
		glue = {"nz.co.zufang.steps"},
		plugin = {"html:target/site/cucumber-pretty", "junit:target/site/cucumber.xml"}
	)
public class TestRunner {

}
