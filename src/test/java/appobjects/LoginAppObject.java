package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {
	
	private WebDriver driver;
	
	public LoginAppObject(WebDriver driver){
		this.driver = driver;
	}
	
	public WebElement getUsuarioTextField() {
		return driver.findElement(By.id("email"));			
	}
	
	public WebElement getSenhaTextField() {
		return driver.findElement(By.id("passwd"));			
	}
	
	public WebElement getSingInButton() {
		return driver.findElement(By.id("SubmitLogin"));			
	}
	
	
	

}
