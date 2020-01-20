package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompraProdutoAppObject {

	private WebDriver driver;
	protected WebDriverWait wait;

	public CompraProdutoAppObject(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 10);
	}

	public WebElement getProdutoTelaInicial(String produto) {
		return driver.findElement(
				By.xpath("//ul[@id='homefeatured']/li[@class='"+produto+"']//a[@class='product-name']"));
	}

	public WebElement getAddToCartButtonTelaProduto() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("add_to_cart")));
		return driver.findElement(By.id("add_to_cart"));
	}

	public WebElement getCheckoutButtonModal() {
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='layer_cart']//a")));
		return driver.findElement(By.xpath("//div[@id='layer_cart']//a"));

	}

	public WebElement getNomeProduto() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@id='product_reference']/span")));
		return driver.findElement(By.xpath("//p[@id='product_reference']/span"));

	}

	public WebElement getNomeProdutoCarrinho() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//small[@class='cart_ref']")));
		return driver.findElement(By.xpath("//small[@class='cart_ref']"));

	}

	public WebElement getEnderecoLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(
				By.xpath("//ul[@id='address_delivery']/li[@class='address_address1 address_address2']")));
		return driver
				.findElement(By.xpath("//ul[@id='address_delivery']/li[@class='address_address1 address_address2']"));
	}

	public WebElement getCheckoutButtonCarrinho() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(
				"//div[@id='center_column']//a[@class='button btn btn-default standard-checkout button-medium']")));
		return driver.findElement(By.xpath(
				"//div[@id='center_column']//a[@class='button btn btn-default standard-checkout button-medium']"));
	}

	public WebElement getProceedToCheckoutButtonAdress() {
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.xpath("//div[@id=\"center_column\"]//button[@name='processAddress']")));
		return driver.findElement(By.xpath("//div[@id=\"center_column\"]//button[@name='processAddress']"));
	}

	public WebElement getTermosCheckBox() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("cgv")));
		return driver.findElement(By.id("cgv"));
	}
	
	public WebElement getPrecoFreteLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("total_shipping")));
		return driver.findElement(By.id("total_shipping"));
	}
	
	public WebElement getPrecoUnidadeLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("span[class='price'] > span[class$='price'][class^='price']")));
		return driver.findElement(By.cssSelector("span[class='price'] > span[class$='price'][class^='price']"));
	}
	
	public WebElement getQuantidadeLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[@class='cart_quantity text-center']/span")));
		return driver.findElement(By.xpath("//td[@class='cart_quantity text-center']/span"));
	}
	
	public WebElement getPrecoFinalLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("total_price")));
		return driver.findElement(By.id("total_price"));
	}
	
	public WebElement getFormaDePagamentoButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@class='bankwire']")));
		return driver.findElement(By.xpath("//a[@class='bankwire']"));
	}
	
	public WebElement getConfirmOrdemButton() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@class='button btn btn-default button-medium']")));
		return driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
	}

	public WebElement getConfirmaCompraLabel() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[@class='cheque-indent']/strong")));
		return driver.findElement(By.xpath("//p[@class='cheque-indent']/strong"));
	}
	
	public WebElement getCheckoutButtonFrete() {
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form[@id=\"form\"]//button[@type='submit']")));
		return driver.findElement(By.xpath("//form[@id=\"form\"]//button[@type='submit']"));
	}
	

	
}
