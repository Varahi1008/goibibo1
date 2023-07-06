package com.goibibo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class pageobjectmanager extends baseclass {
	
public pageobjectmanager() {
		
	}
	
	private loginpage lp;
	
	private Flights sp;
	
	public loginpage getloginpage() {
		
		if(lp==null) {
			lp = new loginpage();	
		}
        
        
        return lp;
	
	}
	
	public Flights getFlights() {
		if(sp==null)
		{
        sp = new Flights();
		}
        return sp;
	
	}


}
