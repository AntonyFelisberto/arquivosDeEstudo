package com.everis.pages;

import org.openqa.selenium.WebElement;              //chamando qual função do junit vai usar
import org.openqa.selenium.support.FindBy;         //chamando qual função do junit vai usar 
import org.openqa.selenium.support.PageFactory;    //chamando qual função do junit vai usar

import com.everis.util.Hooks;                      //chamando a classe de outro pacote

public class HomePage extends BasePage {

	@FindBy(css = "#search_query_top")
	protected WebElement campoBusca;//instanciando o web element ja como protected
	
	@FindBy(name = "submit_search")
	protected WebElement botaoLupaBuscar;//instanciando o web element ja como protected
	
	public HomePage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void pesquisarProduto(String nomeProduto) {
		campoBusca.sendKeys(nomeProduto);//chamando metodo do campobusca
		botaoLupaBuscar.click();//chamando metodo do botaoLupaBuscar
		log("Pesquisou pelo produto: " + nomeProduto);
	}

}