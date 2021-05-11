package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Page2 {
	public static WebDriver driver;
	@FindBy(xpath="//input[@name='radiobutton_0']")
private WebElement button;

	public WebElement getButton() {
		return button;
	}
	@FindBy(xpath="//input[@type='submit']")
	private WebElement contine;

	public WebElement getContine() {
		return contine;
	}
	public Pom_Page2(WebDriver driver) {
		this.driver=driver;

		PageFactory.initElements(driver, this);
	}
}
