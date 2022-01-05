package tests;

import org.junit.After;                                     //importando testes do junit
import org.junit.Assert;                                    //importando testes do junit
import org.junit.Before;                                    //importando testes do junit
import org.junit.Test;                                      //importando testes do junit
import org.openqa.selenium.By;                              //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.WebDriver;                       //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.WebElement;                      //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.chrome.ChromeDriver;             //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.ExpectedConditions;   //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.WebDriverWait;        //importando coisas essenciais para usar selenium webdriver

import pages.CadastrarUsuarioPage;                          //importando o pacote pages.classe CadastrarUsuarioPage

public class CadastrarUsuarioPageTest {

	private WebDriver driver;                           //instanciando o driver que sera usado pra teste
	private CadastrarUsuarioPage cadastrarUsuarioPage;  //instanciando a classe do pacote pages

	@Before                                             //indica os passos que v�o ser executados antes de cada teste
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();                                //fazendo o driver receber os metodos do ChromeDriver
		cadastrarUsuarioPage = new CadastrarUsuarioPage(driver);    //fazendo o cadastrarUsuarioPage receber os metodos do CadastrarUsuarioPage passando como parametro o driver
		
	}

	@Test                                               //indica que tudo que esta dentro disso s�o testes que ser�o executados
	public void cadastrarUsuarioPage() {
		
		WebDriverWait wait = new WebDriverWait(driver, 5);

		cadastrarUsuarioPage.cadastrarusuario();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());

	}

	@After                                              //indica os passos que ser�o executados depois que todos os testes forem executados
	public void afterCenario() {
			driver.quit();
	}
}