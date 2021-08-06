package Testsuit;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src\\test\\java\\Testsuit\\dropdown.feature"},
		glue= {"Testsuit"},
		tags= "@dropdown",
		monochrome=true,
		plugin= {"pretty","html:target\\salforce"}
		)
public class dropdowntest extends AbstractTestNGCucumberTests
{

}

