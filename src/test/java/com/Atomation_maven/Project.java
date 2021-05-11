package com.Atomation_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base_class.Base;

public class Project extends Base {
public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
 driver=browserlouncher("chrome");
 openurl("http://automationpractice.com/index.php");
 Thread.sleep(4000);
 WebElement sign = driver.findElement(By.xpath("//a[@rel='nofollow']"));
	clickonelement(sign);
	WebElement mail = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	inputvalue(mail, "prakash98@gmail.com");
WebElement paswrd = driver.findElement(By.xpath("(//input[@type='password'])"));
inputvalue(paswrd, "Prakash@9899");
WebElement login = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
	clickonelement(login);
	maximize();
	Thread.sleep(4000);
	WebElement women = driver.findElement(By.xpath("(//a[@title='Women'])"));
	movehover(women);
	WebElement casul = driver.findElement(By.xpath("//a[@title='Casual Dresses']"));
	movetoelement(casul);
	WebElement img = driver.findElement(By.xpath("//a[@title='Printed Dress']"));
	movetoelement(img);
	Thread.sleep(4000);
	WebElement samit = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
wait(samit);
	}
	
}
