package tasks;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import appobjects.PreencheFormularioAppObject;
import framework.Utils;

public class PreencheFormularioTask {
	private WebDriver driver;
	private PreencheFormularioAppObject preencheFormularioAppObject;
	private Utils utils = new Utils();

	public PreencheFormularioTask(WebDriver driver) {
		this.driver = driver;
		this.preencheFormularioAppObject = new PreencheFormularioAppObject(driver);
	}
	
	
	

	public void cadastraUsuario(String nome, String sobrenome, String senha, int dia, int mes, int ano,
			String companhia, String endereco1, String endereco2, String cidade, int estado, String postalCode,
			String phone, String mobile) {
		preencheFormularioAppObject.getEmailCreatTextField().sendKeys("UsuarioDeTeste"+utils.geraStringlAleatoria() + "@teste.com");
		preencheFormularioAppObject.getCreateAnAccountButton().click();
		preencheFormularioAppObject.getGeneroCheckBox().click();
		preencheFormularioAppObject.getNomeTextField().sendKeys(nome);
		preencheFormularioAppObject.getSobrenomeTextField().sendKeys(sobrenome);
		preencheFormularioAppObject.getSenhaTextField().sendKeys(senha);
		preencheFormularioAppObject.getDiaCombo().selectByIndex(dia);
		preencheFormularioAppObject.getMesCombo().selectByIndex(mes);
		preencheFormularioAppObject.getAnoCombo().selectByIndex(ano);
		preencheFormularioAppObject.getCompanhiaTextField().sendKeys(companhia);
		preencheFormularioAppObject.getEndereco1TextField().sendKeys(endereco1);
		preencheFormularioAppObject.getEndereco2TextField().sendKeys(endereco2);
		preencheFormularioAppObject.getCidadeTextField().sendKeys(cidade);
		preencheFormularioAppObject.getEstadoCombo().selectByIndex(estado);
		preencheFormularioAppObject.getCodigoPostalTextField().sendKeys(postalCode);
		preencheFormularioAppObject.getTelefoneTextField().sendKeys(phone);
		preencheFormularioAppObject.getTelefoneMovelTextField().sendKeys(mobile);
		preencheFormularioAppObject.getRegistertButton().click();

	}
	
	public void confereErros(String quantidadeErros) {
		if (quantidadeErros.equals("1")) {
		assertEquals("There is "+quantidadeErros+" error", preencheFormularioAppObject.getErrorsLaber().getAttribute("innerText"));
		} else
			assertEquals("There are " + quantidadeErros + " errors", preencheFormularioAppObject.getErrorsLaber().getAttribute("innerText"));
		
	}
	
	public void testaEndereco2() {
		preencheFormularioAppObject.getEndereco2TextField();
	}
}
