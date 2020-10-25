package runnerPack;






import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "feature", 
					glue = "steps",
					tags= {"@datatable"},
					dryRun = false,
					monochrome = true,
					strict=false)
public class TestRunner extends AbstractTestNGCucumberTests {


}