package sicredicas;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage {

	public AddCustomerPage(WebDriver navegador) {
		super(navegador);
		PageFactory.initElements(navegador, this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "field-customerName")
	private WebElement inputName;

	@FindBy(id = "field-contactLastName")
	private WebElement inputLastName;

	@FindBy(id = "field-contactFirstName")
	private WebElement inputContactFistName;

	@FindBy(id = "field-phone")
	private WebElement inputPhone;

	@FindBy(id = "field-addressLine1")
	private WebElement inputAddressLineone;

	@FindBy(id = "field-addressLine2")
	private WebElement inputAddressLinetwo;

	@FindBy(id = "field-city")
	private WebElement inputCity;

	@FindBy(id = "field-state")
	private WebElement inputState;

	@FindBy(id = "field-postalCode")
	private WebElement inputPostalCode;

	@FindBy(id = "field-country")
	private WebElement inputCountry;

	@FindBy(xpath = "//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/a/span")
	private WebElement comboboxFromEmployeer;

	@FindBy(id = "field-creditLimit")
	private WebElement inputCreditLimit;

	@FindBy(id = "form-button-save")
	private WebElement buttonSave;

	@FindBy(xpath = "//*[@id=\"report-success\"]/p/a[2]")
	private WebElement goBacktoList;

	public AddCustomerPage inputName(String name) {
		inputName.sendKeys(name);
		return this;
	}

	public AddCustomerPage inputLastName(String lastname) {
		inputLastName.sendKeys(lastname);
		return this;
	}

	public AddCustomerPage inputContactFirstName(String contactfirstname) {
		inputContactFistName.sendKeys(contactfirstname);
		return this;
	}

	public AddCustomerPage inputPhone(String phone) {
		inputPhone.sendKeys(phone);
		return this;
	}

	public AddCustomerPage inputAddressLineone(String addresslineone) {
		inputAddressLineone.sendKeys(addresslineone);
		return this;
	}

	public AddCustomerPage inputAddressLinetwo(String addresslinetwo) {
		inputAddressLinetwo.sendKeys(addresslinetwo);
		return this;
	}

	public AddCustomerPage inputCity(String city) {
		inputCity.sendKeys(city);
		return this;
	}

	public AddCustomerPage inputState(String state) {
		inputState.sendKeys(state);
		return this;
	}

	public AddCustomerPage inputPostalCode(String postalcode) {
		inputPostalCode.sendKeys(postalcode);
		return this;
	}

	public AddCustomerPage inputCountry(String country) {
		inputCountry.sendKeys(country);
		return this;
	}

	public AddCustomerPage selectFromEmployeer(String employeer) {
		comboboxFromEmployeer.click();
		WebElement a = navegador
				.findElement(By.xpath("//*[@id=\"field_salesRepEmployeeNumber_chosen\"]/div/div/input"));
		a.sendKeys(employeer);
		a.sendKeys(Keys.ENTER);
		return this;
	}

	public AddCustomerPage inputCreditLimit(String creditlimit) {
		inputCreditLimit.sendKeys(creditlimit);
		return this;
	}

	public AddCustomerPage clickButtonSave() {
		buttonSave.click();
		return this;
	}

	public String returnMessage() {
		WebElement message = navegador.findElement(By.xpath("//*[@id=\"report-success\"]/p"));
		String messageSucess= message.getText();
		return messageSucess;
	}

	public GroceryPage clickGoBacktoList() {
		goBacktoList.click();
		return new GroceryPage(navegador);

	}
}
