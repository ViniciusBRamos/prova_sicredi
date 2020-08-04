package sicredicas;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.corba.se.impl.oa.poa.ActiveObjectMap.Key;

public class GroceryPage extends BasePage {

	public GroceryPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "switch-version-select")
	private WebElement comboboxVersion;

	@FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[1]/div[1]/a")
	private WebElement buttonAddCustomer;

	@FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[3]/input")
	private WebElement inputSearchName;

	@FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[1]/input")
	private WebElement check;

	@FindBy(xpath = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a")
	private WebElement buttonDelete;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div/div/div[2]/p[2]")
	private WebElement messageDelete;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[2]")
	private WebElement buttonDeleteMessage;

	@FindBy(xpath = "*//span[@data-growl=\"message\"]")
	private WebElement messageSucess;

	WebDriverWait sleep = new WebDriverWait(navegador, 2);

	public GroceryPage selectVersion(String version) {
		Select slt = new Select(comboboxVersion);
		slt.selectByVisibleText(version);
		return this;
	}

	public AddCustomerPage clickButtonAddCustomer() {
		buttonAddCustomer.click();
		return new AddCustomerPage(navegador);
	}

	public GroceryPage searchName(String name) {
		inputSearchName.sendKeys(name);
		inputSearchName.sendKeys(Keys.ENTER);
		return this;
	}

	public GroceryPage clickCheck() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		check.click();
		return this;
	}

	public GroceryPage clickButtonDelete() {
		buttonDelete.click();
		return this;
	}

	public GroceryPage confirmDelete() {
		String message = messageDelete.getText();
		String messagevalidation = "Are you sure that you want to delete this 1 item?";
		if (!message.equals(messagevalidation)) {
			throw new NullPointerException("Mensagem diferente");
		}
		buttonDeleteMessage.click();
		return this;
	}

	public String returnMessageSucess() {
		String mensage = sleep.until(ExpectedConditions.visibilityOf(messageSucess)).getText();
		return mensage;
	}

}
