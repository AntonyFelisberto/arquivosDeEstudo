package pages;

import org.openqa.selenium.WebDriver;           //importando coisas essenciais para usar selenium webdriver

import utils.Utils;                             //importando o pacote utils.classe utils

public class RealizarLoginPage {
	
	private WebDriver driver;   //instanciando o driver que sera usado pra teste
	private Utils util;         //instanciando a classe do pacote utils
	
	public RealizarLoginPage(WebDriver driver) {
		this.driver = driver;
		util = new Utils(driver);       //fazendo o util receber os metodos do Utils passando como parametro o driver	
	}
	
	public void RealizarLogin() {
		
		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email", "everisbootcamp@qabeginner.com");
		util.preencheCampoPorId("passwd", "QA@everis213");
		util.clickPorNome("SubmitLogin");
		
	}

}
