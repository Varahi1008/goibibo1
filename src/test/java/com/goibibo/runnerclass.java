package com.goibibo;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class runnerclass extends baseclass {
	
	
	pageobjectmanager pom = new pageobjectmanager();
	
	@BeforeSuite
	
	private void browserlaunch()
	
	{
		launchBrowser("chrome");
	
		
	}
	
	@BeforeTest
	
	private void lauchurl() {
		
		launchUrl("https://www.goibibo.com/");
		
		}
	
	
	@Parameters("mobileno")
	@Test (priority = -2)
	private void login(String no) {
			
		clickButton(pom.getloginpage().getMobilenumber());
		wait(2);
		passInput(pom.getloginpage().getMobilenumber(),no);
		
		WebDriverWait wait = new WebDriverWait(driver,40);
		wait.until(ExpectedConditions.elementToBeClickable(pom.getloginpage().getIllDoLater()));
		
		clickButton(pom.getloginpage().getIllDoLater());		
	}
	
	@Parameters({"from","to"})

	@Test (priority = -1)
	
   private void search(String from, String to) {
		
	wait(5);
	clickButton(pom.getFlights().getRoundtrip());
	
	wait(5);
	clickButton(pom.getFlights().getFrom());
	wait(2);
	passInput(pom.getFlights().getText(),from);
	pom.getFlights().getText().sendKeys(Keys.ARROW_DOWN);
	wait(2);
	pom.getFlights().getText().sendKeys(Keys.ENTER);
	wait(5);
	
	wait(5);
	
	passInput(pom.getFlights().getText(),to);
	
	wait(3);
	
	//pom.getFlights().getText().sendKeys(Keys.ARROW_DOWN);
	//wait(2);
	pom.getFlights().getText().sendKeys(Keys.ENTER);
	wait(5);
	
	wait(5);
	//clickButton(pom.getFlights().getDepature());
	clickButton(pom.getFlights().getdate1());
	
	clickButton(pom.getFlights().getReturntab());

	clickButton(pom.getFlights().getdate2());

	clickButton(pom.getFlights().getdone());
	
	wait(5);
	
	
	
	clickButton(pom.getFlights().getTravellerclass());
	clickButton(pom.getFlights().getAdult());
	clickButton(pom.getFlights().getChildren());
	clickButton(pom.getFlights().getdone1());

	
	wait(5);
	clickButton(pom.getFlights().getsearchfight());

	
	}
	
	
	

}
