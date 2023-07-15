package org.bve;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbloginPojo extends BaseClass{
	public FbloginPojo() {
		PageFactory.initElements(driver, this);
		}
	//private Elements
	@FindBy(id = "email")
     private WebElement email;
		
	@FindBy(id = "pass")
	private WebElement password;
	
	@FindBy(name= "login")
	private WebElement login;
	
	//getters to access webelements outside the class

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
	
	
	
	

	

}
