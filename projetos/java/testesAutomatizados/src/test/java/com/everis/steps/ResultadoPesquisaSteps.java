package com.everis.steps;

import com.everis.pages.ResultadoPesquisaPage;//chamando a classe de outro pacote

import io.cucumber.java.pt.Quando;//chamando qual função do junit vai usar

public class ResultadoPesquisaSteps {

	@Quando("^adiciona o produto \"(.*)\" ao carrinho$")                                //esse Quando é uma das nomeações de metodos do junit que o cucumber vai ler e executar// ja o \"(.*)\" é o que vai receber como parametro quando for executar os testes
	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		ResultadoPesquisaPage resultadoPesquisaPage = new ResultadoPesquisaPage();//instanciando a classe de outro pacote
		resultadoPesquisaPage.adicionarProdutoAoCarrinho(nomeProduto);//chamando o metodo da classe
	}
	
}
