package com.everis.pages;

import org.openqa.selenium.By;                  //chamando qual função do junit vai usar
import org.openqa.selenium.WebElement;          //chamando qual função do junit vai usar
import org.openqa.selenium.support.FindBy;      //chamando qual função do junit vai usar
import org.openqa.selenium.support.PageFactory; //chamando qual função do junit vai usar

import com.everis.util.Hooks;                   //chamando a classe de outro pacote

public class ResultadoPesquisaPage extends BasePage {

	@FindBy(xpath = "//*[text()='Add to cart']")
	protected WebElement botaoAdicionarAoCarrinho;//instanciando o web element ja como protected
	
	@FindBy(css = "[title='Proceed to checkout']")
	protected WebElement botaoProsseguir;//instanciando o web element ja como protected
	
	public ResultadoPesquisaPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	public void adicionarProdutoAoCarrinho(String nomeProduto) {
		WebElement nomeProdutoTela = driver.findElement(By.xpath(".//*[@itemprop='name']/*[contains(text(), '" + nomeProduto + "')] | .//*[@itemprop='name'][text()='" + nomeProduto + "']"));
		moveToElement(nomeProdutoTela);
		botaoAdicionarAoCarrinho.click();
		waitElement(botaoProsseguir, 10).click();
		log("Adicionou o produto [" + nomeProduto + "] ao carrinho");
	}

}