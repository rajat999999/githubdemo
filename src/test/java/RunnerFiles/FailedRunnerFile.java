package RunnerFiles;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (features = "@target/failedscenarios.txt" , glue ="StepDefinitions",
monochrome=true,tags="@landing", plugin ={"html:test-output/report.html","json:test-output/report.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}  )
		
public class FailedRunnerFile extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
