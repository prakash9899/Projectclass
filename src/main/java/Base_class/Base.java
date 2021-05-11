package Base_class;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
	 public static WebDriver driver;//null driver 
	 public static Actions a;//mouse handling
	 public static Select s ;// droupdown
	 public static Alert al;//alart
	 public static TakesScreenshot ts = (TakesScreenshot) driver;// tackscreenshot
	 public static File destion;// tackscreenshot
	 public static Robot r;
	 public static WebDriverWait wait ;//explicit

	 	public static WebDriver browserlouncher(String browser) {
	 if (browser.equalsIgnoreCase("chrome")) {
	 	System.setProperty("webdriver.chrome.driver", 
	 			System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	 	driver =new ChromeDriver();
	 }
	 else {
	 	System.out.println("invalid");
	 }return driver;}
	 	//wait
	 	public static void wait(WebElement element) {
	 wait= new WebDriverWait(driver, 30);
	 wait.until(ExpectedConditions.invisibilityOf(element));
	 movetoelement(element);
	 	}
	 	//close
	 	public static  void close() {
	 driver.close();}
	 	//Quit
	 	public static void Quit() {
	 driver.quit();}
	 	//maximize
	 	public static void maximize() {
	 driver.manage().window().maximize();
	 	}
	 	//quit
	 	public static void quit() {
	 driver.quit();}
	 	//frame
	 	public static void ifram(WebElement element) {
	 driver.switchTo().frame(element);}
	 	public static void iframinput(WebElement element, String str) {
	 inputvalue(element, str);}
	 	//tack screenshot
	 public static void toscreenshot(String addres) throws IOException{
	 	File sourse =ts.getScreenshotAs(OutputType.FILE);
	 destion =new File(addres);
	 FileUtils.copyFile(sourse, destion);
	 }
	 //forword
	 public static void forword() {
	 driver.navigate().forward();}
	 //back
	 public static void back() {
	 driver.navigate().back();}
	 //refresh
	 public static void reload() {
	 driver.navigate().refresh();}
	 	//getoption
	 	public static void getoption(WebElement element) {
	 List<WebElement> options = s.getOptions();
	 for (WebElement alloption : options) {
	 	String text = alloption.getText();
	 	System.out.println(text);	
	 }}
	 	//is multiple
	 	public static void multiple(WebElement element ) {
	 boolean multiple1 = s.isMultiple();
	 System.out.println(multiple1);
	 	}
	 	//get attribute
	 	public static void getattribute(WebElement element,String ele) {
	 		element.getAttribute(ele);
	 	}
	 	//get current url
	 	public static void geturl(String url) {
	 driver.getCurrentUrl();
	 	}
	 	
	 	//mouse actions
	 	public static void movetoelement(WebElement element) {
	 		a = new Actions(driver);
	 		a.moveToElement(element).click().build().perform();
	 	}
	 	public static  void movehover(WebElement element) {
	 		a= new Actions(driver);
	 		a.moveToElement(element).build().perform();
	 	}
	 	public static  void rightclick(WebElement element) {
	 		a = new Actions(driver);
	 		a.contextClick(element).build().perform();
	 	}
	 	//droup down---- single dropudown
	 		public static void byvalue(WebElement webElement, String element) {
	 			s=new Select(webElement);
	 s.selectByValue(element);
	 		}
	 		public static void byindex(WebElement webElement, int element) {
	 			s= new Select(webElement);
	 s.selectByIndex(element);
	 		}
	 		public static void byvisibletext(WebElement webElement, String element) {
	 			s= new Select(webElement);
	 s.selectByVisibleText(element);
	 		}
	 		//alart
	 		public static void simplealart(WebElement element) {
	 al= driver.switchTo().alert();
	 al.accept();
	 		}
	 		public static void confirmalart(WebElement element) {
	 al=driver.switchTo().alert();
	 al.accept();
	 		}
	 		public static  void promptalart(WebElement element, String str) {
	 al=driver.switchTo().alert();
	 inputvalue(element, str);
	 al.accept();	}
	 		//is selected
	 		public static void isseleted(WebElement driver) {
	 driver.isSelected();}
	 		//get title
	 		public static void title(WebElement element) {
	 		driver.getTitle();
	 		}
	 	//driver.get
	 	public static  void openurl(String url) {
	 driver.get(url);
	 	}
	 	//click
	 	public static  void clickonelement(WebElement driver) {
	 driver.click();
	 	}	
	 	//sendkey
	 	public  static void inputvalue(WebElement element,String str) {
	 		element.sendKeys(str);
	 		}
	 	//frist selelted
	 	public static void fristselected() {
	 s.getFirstSelectedOption().getText();}
	 	//all seleted
	 public static void allseleted() {
	 s.getAllSelectedOptions();}
	 //windo handals
	 public static void windohandles(WebElement element) {
	 Set<String> windowHandles = driver.getWindowHandles();
	 for (String string : windowHandles) {
	 String title = driver.switchTo().window(string).getTitle();
	 System.out.println(title);}
	 }
	 		
	 		

}

