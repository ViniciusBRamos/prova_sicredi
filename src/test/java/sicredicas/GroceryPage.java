package sicredicas;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GroceryPage extends BasePage {

	public GroceryPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy (id = "switch-version-select")
	private WebElement comboboxVersion;
	
	
	@Test
	public void selectVersion() {
		Select slt = new Select(comboboxVersion);
		slt.selectByVisibleText("Bootstrap V4 Theme");
		//return this;
	}
	

}
