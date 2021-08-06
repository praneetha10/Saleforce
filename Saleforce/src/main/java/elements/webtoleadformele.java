package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class webtoleadformele
{
	@FindBy(how=How.NAME,using="salutation") public static WebElement dropdown;
	@FindBy(how=How.XPATH,using="//input[@id='first_name']") public static WebElement firstname;
	@FindBy(how=How.XPATH,using="//input[@id='last_name']") public static WebElement lastname;
	@FindBy(how=How.XPATH,using="//input[@id='email']") public static WebElement email;
	@FindBy(how=How.XPATH,using="//input[@id='city']") public static WebElement city;
	@FindBy(how=How.XPATH,using="//input[@id='mobile']") public static WebElement mobile;
	@FindBy(how=How.XPATH,using="//input[@id='fax']") public static WebElement fax;
	@FindBy(how=How.XPATH,using="//input[@id='zip']") public static WebElement zip;
	@FindBy(how=How.XPATH,using="//input[@id='country']") public static WebElement country;
	@FindBy(how=How.XPATH,using="//input[@id='state']") public static WebElement state;
	@FindBy(how=How.XPATH,using="//input[@name='submit']") public static WebElement senddata;
}
