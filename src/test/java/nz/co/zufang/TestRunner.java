package nz.co.zufang;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * The Class TestRunner.
 */
@RunWith(Cucumber.class)
@CucumberOptions(
//		features = "src/test/resources/CRUDFeatures/UserCreate.feature",
//		features = "src/test/resources/CRUDFeatures/UserLogin.feature",
//		features = "src/test/resources/CRUDFeatures/UserList.feature",
		features = "src/test/resources/CRUDFeatures/UserUpdate.feature",
//		features = "src/test/resources/CRUDFeatures/UserDelete.feature",
		glue = {"nz.co.zufang.steps"},
		plugin = {"html:target/site/cucumber-pretty", "junit:target/site/cucumber.xml"}
	)
public class TestRunner {

}