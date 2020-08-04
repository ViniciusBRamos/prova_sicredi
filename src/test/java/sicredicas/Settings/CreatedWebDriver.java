package sicredicas.Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreatedWebDriver {
	
	public static WebDriver createChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vinicius.ramos\\eclipse-workspace\\driver\\chromedriver.exe");
		WebDriver navegador = new ChromeDriver();
		navegador.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		navegador.get("https://www.grocerycrud.com/demo/bootstrap_theme");		
		return navegador;
		
	}

}
