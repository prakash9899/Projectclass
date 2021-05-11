package Base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_class {

	
public static WebDriver driver;
	
	@FindBy(xpath = "//input[@type='text']")
private WebElement mail;
	
	public WebElement getMail() {
		return mail;
	}

	
}
