package tests;

import org.junit.After;             //importando testes do junit
import org.junit.Assert;            //importando testes do junit
import org.junit.Before;            //importando testes do junit
import org.junit.Test;              //importando testes do junit
import org.openqa.selenium.By;                               //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.WebElement;                      //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.chrome.ChromeDriver;            //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.ExpectedConditions; //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.support.ui.WebDriverWait;     //importando coisas essenciais para usar selenium webdriver

public class CadastrarUsuarioTest {

	private ChromeDriver driver;    //instanciando o driver que sera usado pra teste

	@Before                         //indica os passos que vão ser executados antes de cada teste
	public void inicializa() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test                       //indica que tudo que esta dentro disso são testes que serão executados
	public void cadastrarUsuario() {
		
		WebDriverWait wait = new
		WebDriverWait(driver, 5);

		driver.get("http://automationpractice.com/index.php");

		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email_create")).sendKeys("everisbootcamp@qabeginner.com");
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("July");
		driver.findElement(By.id("customer_lastname")).sendKeys("Sanders");
		driver.findElement(By.id("passwd")).sendKeys("QA@everis213");
		driver.findElement(By.cssSelector("#days")).sendKeys("1");
		driver.findElement(By.cssSelector("#months")).sendKeys("January");
		driver.findElement(By.cssSelector("#years")).sendKeys("2000");
		driver.findElement(By.id("address1")).sendKeys("Street name, 213");
		driver.findElement(By.id("city")).sendKeys("Honolulu");
		driver.findElement(By.id("id_state")).sendKeys("Hawaii");
		driver.findElement(By.id("postcode")).sendKeys("96815");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9999999999");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Address 1");
		driver.findElement(By.id("submitAccount")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
		
                /* CHAMA OS METODOS QUE FORAM INSTANCIADOS NA CLASSE DRIVER E WAIT, faz inserções para que os testes sejam executados
		driver.findElement(By.cssSelector("#header > div.nav > div > div > nav > div.header_user_info > a")).click();
		driver.findElement(By.id("email_create")).sendKeys("everisbootcamp@qabeginner.com");
		driver.findElement(By.cssSelector("button[id='SubmitCreate'] span")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("id_gender2")));
		driver.findElement(By.id("id_gender2")).click();
		driver.findElement(By.id("customer_firstname")).sendKeys("July");
		driver.findElement(By.id("customer_lastname")).sendKeys("Sanders");
		driver.findElement(By.id("passwd")).sendKeys("QA@everis213");
		driver.findElement(By.cssSelector("#days")).sendKeys("1");
		driver.findElement(By.cssSelector("#months")).sendKeys("January");
		driver.findElement(By.cssSelector("#years")).sendKeys("2000");
		driver.findElement(By.id("address1")).sendKeys("Street name, 213");
		driver.findElement(By.id("city")).sendKeys("Honolulu");
		driver.findElement(By.id("id_state")).sendKeys("Hawaii");
		driver.findElement(By.id("postcode")).sendKeys("96815");
		driver.findElement(By.id("id_country")).sendKeys("United States");
		driver.findElement(By.id("phone_mobile")).sendKeys("9999999999");
		driver.findElement(By.id("alias")).clear();
		driver.findElement(By.id("alias")).sendKeys("Address 1");
		driver.findElement(By.id("submitAccount")).click();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[title='Orders'] span"))); 
		WebElement validaTexto = driver.findElement(By.cssSelector("a[title='Orders'] span"));
		Assert.assertEquals("ORDER HISTORY AND DETAILS", validaTexto.getText());
		*/
	}

	@After                                                  //indica os passos que serão executados depois que todos os testes forem executados
	public void afterCenario() {
			driver.quit();		
	}

}
