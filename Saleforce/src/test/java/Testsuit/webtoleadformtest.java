package Testsuit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\webtoleadform.feature"},
		glue= {"Testsuit"},
		tags="@webtoleadform",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)
public class webtoleadformtest  extends AbstractTestNGCucumberTests
{

}

