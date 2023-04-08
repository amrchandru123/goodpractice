package checkborunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features=".//src/test/resources/ChanFile/checkbox.feature",glue ="stepcheckbo",
plugin = {"pretty","html:test-output"})
public class checkborunnerfile {

	
	
	
	

}
