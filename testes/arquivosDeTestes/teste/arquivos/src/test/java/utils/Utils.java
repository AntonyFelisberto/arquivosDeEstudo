package utils;

import org.openqa.selenium.By;          //importando coisas essenciais para usar selenium webdriver
import org.openqa.selenium.WebDriver;   //importando coisas essenciais para usar selenium webdriver

public class Utils {
	private WebDriver driver;       //instanciando o driver que sera usado pra teste

	public Utils(WebDriver driver) {
		this.driver = driver;
	}

	public void preencheCampoPorId(String id_campo, String value) {

		driver.findElement(By.id(id_campo)).sendKeys(value);
	}
	
	public void preencheCampoPorCss(String id_campo, String value) {

		driver.findElement(By.cssSelector(id_campo)).sendKeys(value);
	}

	public void clickPorCss(String css_campo) {

		driver.findElement(By.cssSelector(css_campo)).click();
	}

	public void clickPorNome(String name_campo) {

		driver.findElement(By.name(name_campo)).click();
	}

	public void clickPorId(String id_campo) {

		driver.findElement(By.id(id_campo)).click();
	}

}
