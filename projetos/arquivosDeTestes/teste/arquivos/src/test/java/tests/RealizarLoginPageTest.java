package tests;

import org.junit.After;                                         //importando testes do junit
import org.junit.Assert;                                        //importando testes do junit
import org.junit.Before;                                        //importando testes do junit
import org.junit.Test;                                          //importando testes do junit
import org.openqa.selenium.By;                                  //importando coisas essenciais do selenium webdriver
import org.openqa.selenium.WebDriver;                           //importando coisas essenciais do selenium webdriver
import org.openqa.selenium.WebElement;                          //importando coisas essenciais do selenium webdriver
import org.openqa.selenium.chrome.ChromeDriver;                 //importando coisas essenciais do selenium webdriver
import org.openqa.selenium.support.ui.ExpectedConditions;       //importando coisas essenciais do selenium webdriver
import org.openqa.selenium.support.ui.WebDriverWait;            //importando coisas essenciais do selenium webdriver

import pages.RealizarLoginPage;                                 //importando o pacote pages.classe RealizarLoginPage

public class RealizarLoginPageTest {
	
	private WebDriver driver;                       //instanciando o driver que sera usado pra teste
	private RealizarLoginPage realizarLoginPage;    //instanciando a classe do pacote pages
	
	@Before                                         //indica os passos que vão ser executados antes de cada teste
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();                        //fazendo o driver receber os metodos do ChromeDriver
		realizarLoginPage = new RealizarLoginPage(driver);  //fazendo o realizarLoginPage receber os metodos do realizarLoginPage passando como parametro o driver		
	}
	
	@Test                                           //indica que tudo que esta dentro disso são testes que serão executados
	public void realizarlogin() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		
		realizarLoginPage.RealizarLogin();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
	}
	
	@After                                      //indica os passos que serão executados depois que todos os testes forem executados
	public void quit() {
		driver.quit();
	}

}
