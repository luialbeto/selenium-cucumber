package io.cucumber.danilo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.an.E;
import io.cucumber.java.es.Dado;
import io.cucumber.java.pt.Então;

public class ConsultaSiteProfSteps {

	public WebDriver browser;

	public void EntrarSite() {
		System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
		browser = new ChromeDriver();
	}

	@Dado("que estou no site do tornese um programador")
	public void que_estou_no_site_do_tornese_um_programador() {
		browser.navigate().to("https://www.torneseumprogramador.com.br/");
	}

	@E("digito no campo de busca a palavra {string}")
	public void digito_no_campo_de_busca_a_palavra(String string) {
		WebElement input = browser.findElement(By.cssSelector("[cform-pesquisa]"));
		input.sendKeys(string);
		input.click();
	}

	@Então("devo ver o resultado na busca")
	public void devo_ver_o_resultado_na_busca(String string) {
		WebElement input = browser.findElement(By.cssSelector("[div-col-h1]"));
		assertEquals(true, "div-col-h1" > 0);
		browser.quit();
	}

};
