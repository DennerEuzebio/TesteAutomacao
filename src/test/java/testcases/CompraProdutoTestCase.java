package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import framework.BaseTest;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import tasks.CompraProdutoTask;
import tasks.LoginTask;

@RunWith(JUnitParamsRunner.class)
public class CompraProdutoTestCase extends BaseTest {

	private WebDriver driver = getDriver();

	private CompraProdutoTask compraProdutoTask = new CompraProdutoTask(driver);
	private LoginTask loginTask = new LoginTask(driver);

	private final String caminhoMassaDeDados = "src\\main\\resources\\massaDeDados\\massaDeDados.csv";
	//private final String caminhoMassaDeDados = "resources/massaDeDados/massaDeDados.csv";

	@FileParameters(caminhoMassaDeDados)
	@Test
	public void compraProduto(String produto) {
		compraProdutoTask.adicionaProdutoNoCarrinho(produto);
		loginTask.logar();
		compraProdutoTask.finalizaCompra();
	}
	
	@Before
	public void setUp() {
		driver.get("http://automationpractice.com/");
	}

}
