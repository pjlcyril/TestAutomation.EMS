package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddEmpPages {

	WebDriver driver;
	
	public AddEmpPages(WebDriver rDriver) {		
		this.driver = rDriver;
		PageFactory.initElements(rDriver, this);
	}

}
