package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.LoginAppObject;

public class LoginTask {
	
	private WebDriver driver;
	
	private LoginAppObject loginAppObject;
	
	public LoginTask(WebDriver driver) {
		this.driver = driver;
		this.loginAppObject = new LoginAppObject(driver);
	}
	
	public void logar() {
		loginAppObject.getUsuarioTextField().sendKeys("testando123@teste.com");
		loginAppObject.getSenhaTextField().sendKeys("12345");
		loginAppObject.getSingInButton().click();
	}
	

}
