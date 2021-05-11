package com.Atomation_maven;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import Base_class.Base;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//test//java//com//adaction_funcation",glue="com.adation.stepdefination")
public class Adaction_Project {
	public static WebDriver  Driver;
	
	@BeforeClass
	public static void Test_Runner() {
		Driver=Base.browserlouncher("chrome");
		
	}
	@AfterClass
	public static  void Testdown() {
		

	}

}
