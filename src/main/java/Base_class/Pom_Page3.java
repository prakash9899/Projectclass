package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Page3 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='first_name']")
private WebElement name;

	public WebElement getName() {
		return name;
	}
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastname;

	public WebElement getLastname() {
		return lastname;
	}
	@FindBy(xpath="//textarea[@name='address']")
	private WebElement addres;
	public WebElement getAddres() {
		return addres;
	}
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement criednumber;
	public WebElement getCriednumber() {
		return criednumber;
	}
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardtype;

	public WebElement getCardtype() {
		return cardtype;
	}
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement expmonth;

	public WebElement getExpmonth() {
		return expmonth;
	}
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement expyr;

	public WebElement getExpyr() {
		return expyr;
	}
	@FindBy(xpath="//input[@name='cc_cvv']")
	private WebElement cvvnumber;

	public WebElement getCvvnumber() {
		return cvvnumber;
	}
	@FindBy(xpath="//input[@type='button']")
	private WebElement booknow;

	public WebElement getBooknow() {
		return booknow;
	}
	@FindBy(xpath="(//input[@type='button'])[2]")
	private WebElement myitation;

	public WebElement getMyitation() {
		return myitation;
	}
	@FindBy(xpath="(//input[@type='button'])[4]")
	private WebElement lagout;

	public WebElement getLagout() {
		return lagout;
	}
	public Pom_Page3(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
}
