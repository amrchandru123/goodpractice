package goodrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = ".//src/test/resources/ChanFile/good1.feature",
glue = "goodstep",dryRun = true,monochrome = true,
plugin = {"pretty","html:test-output"})


public class runnerfile {

}
