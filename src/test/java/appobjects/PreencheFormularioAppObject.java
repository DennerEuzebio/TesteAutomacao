package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PreencheFormularioAppObject {

	private WebDriver driver;
	private WebDriverWait wait;

	public PreencheFormularioAppObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 30);
	}
	
	public WebElement getEmailCreatTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email_create")));
		return driver.findElement(By.id("email_create"));
	}

	public WebElement getCreateAnAccountButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("SubmitCreate")));
		return driver.findElement(By.id("SubmitCreate"));
	}
	
	public WebElement getGeneroCheckBox() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("uniform-id_gender1")));
		return driver.findElement(By.id("uniform-id_gender1"));
	}

	public WebElement getNomeTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer_firstname")));
		return driver.findElement(By.id("customer_firstname"));
	}

	public WebElement getSobrenomeTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("customer_lastname")));
		return driver.findElement(By.id("customer_lastname"));
	}

	public WebElement getSenhaTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("passwd")));
		return driver.findElement(By.id("passwd"));
	}

	public Select getDiaCombo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("days")));
		return new Select(driver.findElement(By.id("days")));
	}

	public Select getMesCombo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("months")));
		return new Select(driver.findElement(By.id("months")));
	}

	public Select getAnoCombo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("years")));
		return new Select(driver.findElement(By.id("years")));
	}

	public WebElement getCompanhiaTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("company")));
		return driver.findElement(By.id("company"));
	}

	public WebElement getEndereco1TextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("address1")));
		return driver.findElement(By.id("address1"));
	}

	public WebElement getEndereco2TextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("address2")));
		return driver.findElement(By.id("address2"));
	}

	public WebElement getCidadeTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("city")));
		return driver.findElement(By.id("city"));
	}

	public Select getEstadoCombo() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_state")));
		return new Select(driver.findElement(By.id("id_state")));
	}

	public WebElement getCodigoPostalTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("postcode")));
		return driver.findElement(By.id("postcode"));
	}

	public WebElement getTelefoneTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phone")));
		return driver.findElement(By.id("phone"));
	}

	public WebElement getTelefoneMovelTextField() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("phone_mobile")));
		return driver.findElement(By.id("phone_mobile"));
	}

	public WebElement getRegistertButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submitAccount")));
		return driver.findElement(By.id("submitAccount"));
	}
	
	
	public WebElement getErrorsLaber() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-danger']/p")));
		return driver.findElement(By.xpath("//div[@class='alert alert-danger']/p"));
	}
	
	
}
