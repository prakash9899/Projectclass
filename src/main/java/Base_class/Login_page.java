package Base_class;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login_page {
public static WebDriver driver;
@FindBy(xpath="//input[@type='text']")
	private WebElement userid;
		public WebElement getUserid() {
			return userid;
		}	
@FindBy(xpath="//input[@type='password']")
	private WebElement passwd;
			public WebElement getPasswd() {
				return passwd;
}
			@FindBy(xpath = "//input[@type='Submit']")
			private WebElement login; public WebElement getLogin() {
				return login;
			}
@FindBy(xpath="//select[@name='location']")	
private WebElement location;
public WebElement getLocation() {
	return location;
}
@FindBy(xpath="//select[@name='hotels']")
private WebElement hotel;
public WebElement getHotel() {
	return hotel;
}
@FindBy(xpath="//select[@name='room_type']")
private WebElement roomtype;
public WebElement getRoomtype() {
	return roomtype;
}
@FindBy(xpath = "//select[@name='room_nos']")
private WebElement numberofroom;
public WebElement getNumberofroom() {
	return numberofroom;
}
@FindBy(xpath="//input[@name='datepick_in']")
private WebElement cheeckindate;
public WebElement getCheeckindate() {
	return cheeckindate;
}
@FindBy(xpath="//input[@name='datepick_out']")
private WebElement checkout;
public WebElement getCheckout() {
	return checkout;
}
@FindBy(xpath="//select[@name='adult_room']")
private WebElement adultnumber;
public WebElement getAdultnumber() {
	return adultnumber;
}
@FindBy(xpath="//select[@name='child_room']")
private WebElement childran;
public WebElement getChildran() {
	return childran;
}

@FindBy(xpath="//input[@type='submit']")
private WebElement search;
public WebElement getSearch() {
	return search;
}
public Login_page(WebDriver driver) {
	this.driver=driver;

	PageFactory.initElements(driver, this);
}






}