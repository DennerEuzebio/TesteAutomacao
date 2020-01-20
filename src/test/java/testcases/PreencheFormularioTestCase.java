package testcases;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import framework.BaseTest;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import tasks.LoginTask;
import tasks.PreencheFormularioTask;

@RunWith(JUnitParamsRunner.class)
public class PreencheFormularioTestCase extends BaseTest {
	
	private WebDriver driver = getDriver();

	private LoginTask loginTask = new LoginTask(driver);
	private PreencheFormularioTask preencheFormularioTask = new PreencheFormularioTask(driver);
	
	
	private final String caminhoMassaDeDados = "src\\main\\resources\\massaDeDados\\massaDeDadosFormulario.csv";
	//private final String caminhoMassaDeDados = "resources/massaDeDados/massaDeDadosFormulario.csv";
	@FileParameters(caminhoMassaDeDados)
	@Test
	public void preencheFormulario(String nome, String sobreNome, String senha, int dia, int mes, int ano,
			String companhia, String endereco1, String endereco2, String cidade, int estado, String postalCode,
			String phone, String mobile, String quantidadeErros) {
		preencheFormularioTask.cadastraUsuario(nome, sobreNome, senha, dia, mes, ano, companhia, endereco1, endereco2, cidade, estado, postalCode, phone, mobile);
		preencheFormularioTask.confereErros(quantidadeErros);
	}
	
	@Before
	public void setUp() {
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	}
}
