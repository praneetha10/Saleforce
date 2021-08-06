package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Convertlead 
{

	@FindBy(how=How.XPATH,using="//span[text()='Mark Status as Complete']") public static WebElement markstatus;
	@FindBy(how=How.XPATH,using="//span[text()='Convert']//parent::button") public static WebElement convert;
	@FindBy(how=How.XPATH,using="//button[text()='Go to Leads']") public static WebElement gotoelements;
}
