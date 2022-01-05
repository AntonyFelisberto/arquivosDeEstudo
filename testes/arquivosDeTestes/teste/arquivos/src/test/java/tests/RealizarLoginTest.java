package tests;

import org.junit.After;                                         //importando testes do junit
import org.junit.Before;                                        //importando testes do junit
import org.junit.Test;                                          //importando testes do junit
import org.openqa.selenium.By;                                  //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.chrome.ChromeDriver;                 //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.ExpectedConditions;       //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.WebDriverWait;            //importando coisas essenciais para usar selenium webdriver

public class RealizarLoginTest {

	private ChromeDriver driver;        //instanciando o driver que sera usado pra teste

	@Before                     //indica os passos que vão ser executados antes de cada teste
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver(); //fazeno o driver receber os metodos do ChromeDriver
	}

	@Test                        //indica que tudo que esta dentro disso são testes que serão executados
	public void logar() {
		
		WebDriverWait wait = new
		WebDriverWait(driver, 5);

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email")).sendKeys("everisbootcamp@qabeginner.com");
		driver.findElement(By.id("passwd")).sendKeys("QA@everis213");
		driver.findElement(By.name("SubmitLogin")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 

	}

	@After                          //indica os passos que serão executados depois que todos os testes forem executados
	public void afterCenario() {
		if (driver != null) {
			driver.close();
			driver.quit();
			driver = null;
		}
	}

}
