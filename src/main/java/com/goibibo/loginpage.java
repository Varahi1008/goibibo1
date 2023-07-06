package com.goibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage extends baseclass  {
	
	
	
	public loginpage() {
		
			
		PageFactory.initElements(driver,this);
	}
	

	@FindBy(name="phone")
	private WebElement Mobilenumber;
	
	
	
	@FindBy (xpath = "//button[text()='I’ll do it later']")
	private WebElement illDoLater;
	
	
	

	public WebElement getMobilenumber() {
		return Mobilenumber;
	}


	

	public WebElement getIllDoLater() {
		return illDoLater;
	}
	
	

	


  	

}
