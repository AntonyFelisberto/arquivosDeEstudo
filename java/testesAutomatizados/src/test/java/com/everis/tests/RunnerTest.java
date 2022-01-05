package com.everis.tests;

import org.junit.ClassRule;
import org.junit.runner.RunWith;            

import io.cucumber.junit.Cucumber;          //chamando o cucumber
import io.cucumber.junit.CucumberOptions;   //chamando o cucumber
import com.everis.util.Hooks;               //chamando a classe de outro pacote            

@RunWith(Cucumber.class)                                                        //roda uma classe junto//no caso o cucumber que é quem le os testes
                 //features define o caminho do que realiza os testes   //tags diz qual é o teste que ele vai rodar
@CucumberOptions(features = "classpath:features", tags = "@test", glue = {""}, 
	monochrome = true, dryRun = false, plugin = { "json:target/cucumber.json", "rerun:target/rerun.txt" })
public class RunnerTest {

	@ClassRule
	public static Hooks hooks = new Hooks();//instanciando a classe de outro pacote
}
