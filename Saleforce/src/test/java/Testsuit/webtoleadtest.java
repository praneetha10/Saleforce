package Testsuit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\web-to-lead.feature"},
		glue= {"Testsuit"},
		tags= "@webtolead",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)
public class webtoleadtest  extends AbstractTestNGCucumberTests
{

}
