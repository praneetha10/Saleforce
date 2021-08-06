package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Dropdownsele 
{
	@FindBy(how=How.XPATH,using="((//input[contains(@aria-owns,'dropdown-element')])[4]//parent::div//following-sibling::div)[2]") public static WebElement dropdown;
	@FindBy(how=How.XPATH,using="(//input[contains(@aria-owns,'dropdown-element')])[5]/parent::div/following-sibling::div") public static WebElement leadsource;
	
	

}
