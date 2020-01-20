package tasks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

import appobjects.CompraProdutoAppObject;

public class CompraProdutoTask {

	private WebDriver driver;

	private CompraProdutoAppObject compraProdutoAppObject;

	public CompraProdutoTask(WebDriver driver) {
		this.driver = driver;
		this.compraProdutoAppObject = new CompraProdutoAppObject(driver);
	}

	public void adicionaProdutoNoCarrinho(String produto) {
		compraProdutoAppObject.getProdutoTelaInicial(produto).click();
		String nomeProduto = compraProdutoAppObject.getNomeProduto().getAttribute("innerText");
		//System.out.println(nomeProduto);
		compraProdutoAppObject.getAddToCartButtonTelaProduto().click();
		compraProdutoAppObject.getCheckoutButtonModal().click();// form[@id="form"]//button[@type='submit']
		assertEquals(nomeProduto,
				compraProdutoAppObject.getNomeProdutoCarrinho().getAttribute("innerText").substring(6));
		compraProdutoAppObject.getCheckoutButtonCarrinho().click();
	}

	public void finalizaCompra() {
		assertEquals("endereco 1 teste endereco 2 teste", compraProdutoAppObject.getEnderecoLabel().getAttribute("innerText"));
		compraProdutoAppObject.getProceedToCheckoutButtonAdress().click();
		compraProdutoAppObject.getTermosCheckBox().click();
		compraProdutoAppObject.getCheckoutButtonFrete().click();
		float precoUnidade = Float
				.parseFloat(compraProdutoAppObject.getPrecoUnidadeLabel().getAttribute("innerText").substring(1));
		float frete = Float
				.parseFloat(compraProdutoAppObject.getPrecoFreteLabel().getAttribute("innerText").substring(1));
		int quantidade = Integer.parseInt(compraProdutoAppObject.getQuantidadeLabel().getAttribute("innerText"));
		float precoFinal = (precoUnidade * quantidade) + frete;
		assertEquals(precoFinal,
				Float.parseFloat(compraProdutoAppObject.getPrecoFinalLabel().getAttribute("innerText").substring(1)),
				0.0f);
		compraProdutoAppObject.getFormaDePagamentoButton().click();
		compraProdutoAppObject.getConfirmOrdemButton().click();
		assertEquals("Your order on My Store is complete.",
				compraProdutoAppObject.getConfirmaCompraLabel().getAttribute("innerText"));
	}

}
