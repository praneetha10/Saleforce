package Testsuit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\import.feature"},
		glue= {"Testsuit"},
		tags= "@import",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)
public class importest extends AbstractTestNGCucumberTests
{

}
