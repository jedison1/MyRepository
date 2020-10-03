package runnerPack;




import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "feature", glue = "steps")
public class TestRunner extends AbstractTestNGCucumberTests {


}