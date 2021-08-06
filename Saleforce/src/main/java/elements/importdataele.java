package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class importdataele 
{
	@FindBy(how=How.XPATH,using="//div[text()='Import']/parent::a") public static WebElement clickimport;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Import your Data ')]") public static WebElement scrollinto;
	@FindBy(how=How.XPATH,using="//a[text()='Leads']") public static WebElement clickleads;
	@FindBy(how=How.XPATH,using="//a[text()='Add new records']") public static WebElement newrecord;
	@FindBy(how=How.XPATH,using="//div[contains(@class,'firstBox selectable-input')]") public static WebElement csv;
	@FindBy(how=How.XPATH,using="//input[@name='file']/parent::form") public static WebElement choosefile;
	@FindBy(how=How.XPATH,using="//a[text()='Next']") public static WebElement clicknext;
	@FindBy(how=How.XPATH,using="//a[text()='Next']") public static WebElement editfieldclick;
	@FindBy(how=How.XPATH,using="//a[text()='Start Import']") public static WebElement startimport;
	@FindBy(how=How.XPATH,using="//a[text()='OK']") public static WebElement clickok;
	@FindBy(how=How.XPATH,using="//div[@data-aura-class='forceListViewPicker']") public static WebElement dropdownlead;
}
