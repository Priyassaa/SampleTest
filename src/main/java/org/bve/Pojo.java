package org.bve;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo extends BaseClass {
	public Pojo() {
		PageFactory.initElements(driver, this);
	}

//private webelements
	// WebElement fb = driver.findElement(By.id("email"));
	@FindBy(xpath = "//meta[contains(@content,'Gmail')]")
	private WebElement search;

	@FindBy(className = "gsib_a gb_ye aJh")
	private WebElement more;

	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath = "//button[@jsname='Cuz2Ue']")
	private WebElement forgotEmail;

	
	// getters to access web elements outside the class
	
	public WebElement getSearch() {
		return search;
	}

	public WebElement getMore() {
		return more;
	}

	public WebElement getEmail() {
		return email;
	}
	
	public WebElement getForgotEmail() {
		return forgotEmail;
	}

	}



	

