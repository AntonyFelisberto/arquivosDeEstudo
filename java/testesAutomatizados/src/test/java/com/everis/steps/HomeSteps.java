package com.everis.steps;

import com.everis.pages.HomePage;//chamando a classe de outro pacote
import com.everis.util.Hooks;

import io.cucumber.java.pt.Dado;//chamando qual função do junit vai usar
import io.cucumber.java.pt.E;   //chamando qual função do junit vai usar

public class HomeSteps {

	@Dado("^que um usuario acessa o site \"(.*)\"$")        //esse Dado é uma das nomeações de metodos do junit que o cucumber vai ler e executar// ja o \"(.*)\" é o que vai receber como parametro quando for executar os testes
	public void acessarSite(String url) {
		Hooks.navigateToULRChrome(url);
	}
	
	@E("^pesquisa pelo produto \"(.*)\"$")                  //esse E é uma das nomeações de metodos do junit que o cucumber vai ler e executar// ja o \"(.*)\" é o que vai receber como parametro quando for executar os testes
	public void pesquisarProduto(String nomeProduto) {
		HomePage homePage = new HomePage();    //instanciando a classe de outro pacote         
		homePage.pesquisarProduto(nomeProduto);//chamando metodo de outra classe
	}
	
}
