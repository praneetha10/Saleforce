package elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Webtoleadelem
{
	@FindBy(how=How.XPATH,using="//*[name()='svg' and @data-key='setup']") public static WebElement setup;
	@FindBy(how=How.XPATH,using="//a[text()='Setup Home']") public static WebElement displaysetup;
	@FindBy(how=How.XPATH,using="//input[@placeholder='Quick Find']") public static WebElement find;
	@FindBy(how=How.XPATH,using="//ul//descendant::li//child::a[text()]/mark") public static WebElement webtolead;
	@FindBy(how=How.XPATH,using="//span[text()='Web-to-Lead']") public static WebElement webtoleadhome;
	@FindBy(how=How.XPATH,using="//tbody/tr/descendant::td[@id='topButtonRow']//input[@title='Edit']") public static WebElement edit;
	@FindBy(how=How.XPATH,using="//input[@id='p1']") public static WebElement enablelead;
	@FindBy(how=How.XPATH,using="(//input[@title='Save'])[1]") public static WebElement savelead;
	@FindBy(how=How.XPATH,using="//input[@title='Create Web-to-Lead Form']") public static WebElement clickcreatelead;
	@FindBy(how=How.XPATH,using="//h2[text()='Create a Web-to-Lead Form']") public static WebElement displayedcreateform;
	@FindBy(how=How.NAME,using="selectedFields_select_0") public static WebElement selectdropdown;
	@FindBy(how=How.XPATH,using="//img[@title='Add']/parent::a") public static WebElement addele;
	@FindBy(how=How.XPATH,using="//img[@title='Up']/parent::a") public static WebElement upele;
	@FindBy(how=How.XPATH,using="//img[@title='Down']/parent::a") public static WebElement downele;
	@FindBy(how=How.XPATH,using="//img[@title='Remove']/parent::a") public static WebElement revmoveele;
	@FindBy(how=How.XPATH,using="//input[@id='captchaEnable']") public static WebElement capchaenable;
	@FindBy(how=How.NAME,using="genHtmlIFrame") public static WebElement textarea;
	@FindBy(how=How.XPATH,using="((//tbody)[2]/tr/td)[2]/descendant::div[@class='webToXHtmlBorder']/textarea") public static WebElement textarea2;
	
}
