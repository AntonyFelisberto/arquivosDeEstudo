package com.everis.steps;

import org.junit.Assert;//chamando a função do junit assert

import com.everis.pages.CarrinhoPage;//chamando a classe de outro pacote

import io.cucumber.java.pt.Entao;//chamando qual função do junit vai usar

public class CarrinhoSteps {
	
	@Entao("^o produto \"(.*)\" deve estar presente no carrinho$")          //esse Entao é uma das nomeações de metodos do junit que o cucumber vai ler e executar// ja o \"(.*)\" é o que vai receber como parametro quando for executar os testes
	public void apresentouProdutoEsperadoNoCarrinho(String nomeProduto) {
		CarrinhoPage carrinhoPage = new CarrinhoPage();//instanciando a classe de outro pacote
		Assert.assertTrue("Deveria ter apresentado o produto [" + nomeProduto + "] no carrinho", 
				carrinhoPage.apresentouProdutoEsperadoNoCarrinho(nomeProduto));
	}
	
}
