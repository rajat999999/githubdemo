package RunnerFiles;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "src/test/java/Feature" , glue ="StepDefinitions",
monochrome=true, plugin ={"html:test-output/report.html","json:test-output/report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:","rerun:target/failedscenarios.txt"}  )
		
public class TestRunnerFile extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
