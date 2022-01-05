package tests;

import org.junit.After;                                     //importando testes do junit
import org.junit.Assert;                                    //importando testes do junit
import org.junit.Before;                                    //importando testes do junit
import org.junit.Test;                                      //importando testes do junit
import org.openqa.selenium.By;                              //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.WebElement;                      //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.chrome.ChromeDriver;             //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.ExpectedConditions;   //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.WebDriverWait;        //importando coisas essenciais para usar selenium webdriver

import utils.Utils;                                         //importando o pacote utils.classe utils

public class CadastrarUsuarioUtilsTest {
	
	private ChromeDriver driver;        //instanciando o driver que sera usado pra teste
	private Utils util;                 //instanciando a classe do pacote utils

	@Before                             //indica os passos que vão ser executados antes de cada teste
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();    //fazendo o driver receber os metodos do ChromeDriver
		util = new Utils(driver);       //fazendo o util receber os metodos do Utils passando como parametro o driver	
	}

	@Test                           //indica que tudo que esta dentro disso são testes que serão executados
	public void cadastrarUsuarioUtils() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);

		driver.get("http://automationpractice.com/index.php");

		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email_create", "everisbootcamp@qabeginner.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "July");
		util.preencheCampoPorId("customer_lastname", "Sanders");
		util.preencheCampoPorId("passwd", "QA@everis213");
		util.preencheCampoPorCss("#days", "1");
		util.preencheCampoPorCss("#months", "January");
		util.preencheCampoPorCss("#years", "2000");
		util.preencheCampoPorId("address1", "Street name, 213");
		util.preencheCampoPorId("city", "Honolulu");
		util.preencheCampoPorId("id_state", "Hawaii");
		util.preencheCampoPorId("postcode", "96815");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999999");
		util.clickPorId("submitAccount");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
                
                /* CHAMA OS METODOS QUE FORAM INSTANCIADOS NA CLASSE UTIL, faz inserções para que os testes sejam executados
		util.clickPorCss("#header > div.nav > div > div > nav > div.header_user_info > a");
		util.preencheCampoPorId("email_create", "everisbootcamp@qabeginner.com");
		util.clickPorCss("button[id='SubmitCreate'] span");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		util.clickPorId("id_gender2");
		util.preencheCampoPorId("customer_firstname", "July");
		util.preencheCampoPorId("customer_lastname", "Sanders");
		util.preencheCampoPorId("passwd", "QA@everis213");
		util.preencheCampoPorCss("#days", "1");
		util.preencheCampoPorCss("#months", "January");
		util.preencheCampoPorCss("#years", "2000");
		util.preencheCampoPorId("address1", "Street name, 213");
		util.preencheCampoPorId("city", "Honolulu");
		util.preencheCampoPorId("id_state", "Hawaii");
		util.preencheCampoPorId("postcode", "96815");
		util.preencheCampoPorId("id_country", "United States");
		util.preencheCampoPorId("phone_mobile", "9999999999");
		util.clickPorId("submitAccount");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
                */

	}

	@After                              //indica os passos que serão executados depois que todos os testes forem executados
	public void afterCenario() {
			driver.quit();

	}

}
