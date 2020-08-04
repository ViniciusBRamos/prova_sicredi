package sicredicas.Tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import sicredicas.Pages.GroceryPage;
import sicredicas.Settings.CreatedWebDriver;

public class TestClass {
	
	private WebDriver navegador;
	GroceryPage grocery ;
	
	
	@Before
	public void setUp() {
		navegador = CreatedWebDriver.createChrome();
		grocery = new GroceryPage(navegador);
	}
	
	
	
	@Test
	public void desafioOne() {
		
		String result = grocery.selectVersion("Bootstrap V4 Theme")
		.clickButtonAddCustomer()
		.inputName("Teste Sicredi")
		.inputLastName("Teste")
		.inputContactFirstName("seu nome")
		.inputPhone("51 9999-9999")
		.inputAddressLineone("Av Assis Brasil, 3970")
		.inputAddressLinetwo("Torre D")
		.inputCity("Porto Alegre")
		.inputState("RS")
		.inputPostalCode("91000-000")
		.inputCountry("Brasil")
		.selectFromEmployeer("Fixter")
		.inputCreditLimit("200")
		.clickButtonSave()
		.returnMessage()
		;
		
		assertTrue(result.contains("Your data has been successfully stored into the database."));
	}
	
	@Test
	public void desafioTwo() {
		String fullProcess = grocery.selectVersion("Bootstrap V4 Theme")
		.clickButtonAddCustomer()
		.inputName("Teste Sicredi")
		.inputLastName("Teste")
		.inputContactFirstName("seu nome")
		.inputPhone("51 9999-9999")
		.inputAddressLineone("Av Assis Brasil, 3970")
		.inputAddressLinetwo("Torre D")
		.inputCity("Porto Alegre")
		.inputState("RS")
		.inputPostalCode("91000-000")
		.inputCountry("Brasil")
		.selectFromEmployeer("Fixter")
		.inputCreditLimit("200")
		.clickButtonSave()
		.clickGoBacktoList()
		.searchName("Teste Sicredi")
		.clickCheck()
		.clickButtonDelete()
		.confirmDelete()
		.returnMessageSucess()
		;	
		
		assertEquals("Your data has been successfully deleted from the database.", fullProcess);
	}
	
	@After
	public void tearDown() {
		navegador.close();
	}

}
